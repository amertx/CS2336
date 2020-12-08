import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class Q19_4 {

    public static void main(String[] args) {
        // write your code here
        Scanner kb = new Scanner(System.in);
        int key;
        Integer [] listOfNumbers = new Integer[10];

        //Sample of numbers chronologically in a list
        for(int i = 0; i < listOfNumbers.length; i++){
            listOfNumbers[i] = i;
        }

        System.out.print("Enter a key: ");
        key = kb.nextInt();

        System.out.print("The key is at " + linearSearch(listOfNumbers, key));

    }

    public static <E extends  Comparable <E>> int linearSearch(E[] list, E key){
        int index;
        //iterate through list
        for(int i= 0; i < list.length; i++){
            //linear search
            if(list[i].compareTo(key) == 0){
                index = i;
                return index;
            }
        }

        return 0;


    }
}
