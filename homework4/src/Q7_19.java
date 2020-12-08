
import java.util.*;

public class Q7_19 {

    public static void main(String[] args) {
        // write your code here
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter list: ");
        //creating a list of elements that is equal to how many a user enters in
        int [] numbers = new int[kb.nextInt()];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = kb.nextInt();
        }

        //calls function
        if(isSorted(numbers) == true){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }

    }

    public static boolean isSorted(int[] list){
        boolean sort = true;

        //checks if current index value is greater than following index value
        for(int i = 0; i < list.length-1; i++){
            if(list[i] >= list[i+1]){
                //false due to it being greater
                sort = false;
            }else{
                sort = true;
            }
        }

        return sort;
    }

}
