//Amer Din
//Hash Table keyword search
//Dec 6, 2020
class HashTableBuilder {
    Element [] hashTable;
    int tableSize;


    HashTableBuilder(int numKeyWords) {
        //tableSize = nextPrime(numKeyWords * 2);
        tableSize = nextPrime(numKeyWords * 2);
        hashTable = new Element[tableSize];
    }

    //delete key
    public void delete(String keyword){
        //initial probe setting and function to find the keyword
        int probe = 1;
        int indexValue = find(keyword);

        //if there is a valid keyword in tableset
        if(indexValue > -1) {
            hashTable[indexValue] = null;
            indexValue = getNextQuadProbIndex(convertStringToInt(keyword), probe++);

            //iterate until no value is left
            while (hashTable[indexValue] != null) {
                Element e = hashTable[indexValue];
                hashTable[indexValue] = null;
                insert(e.keyword, e.head);
                indexValue = getNextQuadProbIndex(convertStringToInt(keyword), probe++);
            }
        }else{
            System.out.println(keyword + "was not found.");
        }

    }

    private Element createNewElement(String keyword, Record recordToAdd) {
        return new Element(keyword, recordToAdd);
    }

    //function is utilized to insert a keyword at the right respective value associated with the key
    void insert(String keyword, FileData fd) {
        Record recordToAdd = new Record(fd.id, fd.title, fd.author, null);
        //map the keyword using the find function
        int index = find(keyword);
        if (index == -1)
            insert(keyword, recordToAdd);
        else {
            //System.out.printf("%s: %d\n", keyword, index);
            recordToAdd.next = hashTable[index].head;
            hashTable[index].head = recordToAdd;
        }
    /*if (!contains(keyword, recordToAdd)) {
      insert(keyword, recordToAdd);*/
    }

    //insertion into hashtable
    private void insert(String keyword, Record recordToAdd) {
        //map the keyword using the find function
        int key = convertStringToInt(keyword);
        //System.out.printf("%d %d\n", key, tableSize);
        //modulo to find the table size
        int index = key % tableSize;
        int probe = 1;
        while (hashTable[index] != null) {
            System.out.printf("%s conflicts with %s at index: %d\n", keyword, hashTable[index].keyword, index);
            index = getNextQuadProbIndex(key, probe++);
        }
        hashTable[index] = createNewElement(keyword, recordToAdd);
    }

    // performs quadratic probing when table is half empty and table length is a prime number
    //returns position
    int find(String keyword) {
        int key = convertStringToInt(keyword);
        //System.out.printf("%d %d\n", key, tableSize);
        int index = key % tableSize;
        int  probe = 1;
        while (hashTable[index] != null) {
            if (hashTable[index].keyword.compareTo(keyword) == 0)
                return index;
            index = getNextQuadProbIndex(key, probe++);
        }
        return -1;
    }

    //avoiding the collision, while not using lazy deletion, the hash is created by converting the string into an int
    private int getNextQuadProbIndex(int key, int probe) {
        return ((key % tableSize) + (int) Math.pow(probe, 2)) % tableSize;
    }

    //conversion of a string to an integer necessary due to how a hash key to value operates
    private int convertStringToInt(String keyword) {
        int sum = 0;
        for (int i=0; i < keyword.length(); i++)
            sum += (int) keyword.charAt(i);
        return sum;
    }

    //function is utilized to check if the number is prime
    private int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if(num%i == 0) {
                num++;
                i=2;
            } else {
                continue;
            }
        }
        return num;
    }

    public void print() {
        int count = 0;
        int printWrap = 0;
        System.out.print("\n\n\n");
        for (int index=0; index<tableSize; index++) {
            if (hashTable[index] != null) {
                System.out.printf("index [%d]: %s (E ---> int): %d\n", index, hashTable[index].keyword, convertStringToInt(hashTable[index].keyword));
                Record rec = hashTable[index].head;
                //System.out.printf("%d|%s|%s\n ---> ", rec.id, rec.author, rec.title);
                System.out.print("\t\t");
                while(rec != null) {
                    if (++printWrap%3 == 0) {
                        System.out.println();
                        System.out.print("\t\t");
                    }
                    //System.out.printf("\t%s\n",r.title);
                    System.out.printf("%d|%s|%s ---> ", rec.id, rec.author, rec.title);
                    rec = rec.next;
                    //printWrap++;
                }
                System.out.println("null\n");
                printWrap = 0;

            }
        }
    }
}