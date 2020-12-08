import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class Q19_7 {

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

        System.out.print("The key is at " + binarySeach(listOfNumbers, key));

    }

    public static <E extends  Comparable <E>> int binarySeach(E[] list, E key){
        int midPoint;
        int maxIndex = list.length-1;
        int minIndex = 0;

        while(minIndex <= maxIndex){
            //halfing of list
            midPoint = (minIndex + maxIndex)/2;
            if(list[midPoint].compareTo(key) == 0){
                return midPoint;
            }
            if(list[midPoint].compareTo(key) < 0){
                minIndex = midPoint+1;
            }else{
                maxIndex = midPoint-1;
            }
        }

        return 0;


    }
}
