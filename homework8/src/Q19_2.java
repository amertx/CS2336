import java.util.*;

public class Q19_2{

    public static void main(String[] args) {
        // write your code here
        Scanner kb = new Scanner(System.in);

        //stack that implements array list
        GenericStack<String> stack = new GenericStack<>();

        for(int i = 1; i <= 5; i++){
            System.out.print("Enter string " + i + ": ");
            stack.push(kb.nextLine());
        }

        //reverse order
        for(int i = 0; i < 5; i++){
            System.out.print(stack.pop() + " ");
        }
    }
}

