
import sun.jvm.hotspot.memory.Universe;

import java.util.*;

public class Q7_32 {

    public static void main(String[] args) {
        // write your code here
        //8 10 1 5 16 61 9 11 1
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter list: ");
        //creating a list of elements that is equal to how many a user enters in
        int[] numbers = new int[kb.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = kb.nextInt();
        }

        System.out.print("After the partition, the list is: ");
        partition(numbers);
        int indexPosition = partition(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("The pivot is at index " + indexPosition);

    }

    public static int partition(int[] list) {
        int min = 0;
        int max = 0;
        int pivot = list[max];
        int i = (min - 1);

        for (int k = min; k < max; k++) {
            //check if value is smaller than pivot
            if (list[k] < pivot) {
                i++;

                //swap elements
                int tempSwap = list[i];
                list[i] = list[k];
                list[k] = tempSwap;
            }
        }


        int tempSwap = list[i + 1];
        list[i + 1] = list[max];
        list[max] = tempSwap;

        return i + 1;
    }
}







