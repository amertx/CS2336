import java.util.*;

public class Q20_6 {

    public static void main(String[] args) {
	    // write your code here
        List <Integer> arrayList = new ArrayList<>();
        for(int i = 1; i < 5000000; i++){
            arrayList.add(i);
        }

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);

        //list iterator
        long timeUsingIterator = System.currentTimeMillis();
        ListIterator<Object> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()){
            listIterator.next();

        }
        //time taken
        long timeDoneUsingIterator = System.currentTimeMillis();
        //output analysis
        System.out.println("The time to traverse a list using an iterator: " + (timeDoneUsingIterator-timeUsingIterator) + " milliseconds");

        //get index
        long timeUsingGetIndex = System.currentTimeMillis();
        linkedList.get(linkedList.size()-1);
        long timeDoneUsingGetIndex = System.currentTimeMillis();

        System.out.println("The time to traverse a list using getIndex(): " + (timeDoneUsingGetIndex-timeUsingGetIndex) + " milliseconds");





    }
}
