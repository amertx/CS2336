
import java.util.*;

public class Q7_15 {

    public static void main(String[] args) {
        // write your code here
        //1 2 3 2 1 6 3 4 5 2
        Scanner kb = new Scanner(System.in);

        int [] numbers = new int[10];
        int [] duplicates = {};

        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = kb.nextInt();
        }
        duplicates = sort(numbers);
        duplicates = eliminateDuplicates(duplicates);
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < duplicates.length; i++){
            System.out.print(duplicates[i] + " ");
        }

    }

    public static int[] eliminateDuplicates(int[] list){
        int counter = 1;
        int initial = 0;

        //checks if the array is less than its length
        while(counter < list.length){
            if(list[counter] == list[initial]){
                counter++;
            }else{
                list[++initial] = list[counter++];

            }
        }
        //appends to duplicate array of ints
        int [] duplicates = new int[initial+1];
        for(int i = 0; i < duplicates.length; i++){
            duplicates[i] = list[i];
        }
        return duplicates;
    }

    public static int[] sort(int[] list) {
        int temp = 0;
        //sort using binary search
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                //swap elements if the index value is not in order
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        //returns sorted list
        return list;
    }

}
