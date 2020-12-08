
import java.util.*;

public class Q11_12 {

    public static void main(String[] args) {
        //Scanner object creation
        Scanner kb = new Scanner(System.in);
        double num1, num2, num3, num4, num5;
        System.out.print("Enter 5 numbers: ");
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        num3 = kb.nextInt();
        num4 = kb.nextInt();
        num5 = kb.nextInt();

        //arraylist creation
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);

        System.out.println("The sum is " + sum(list));


    }

    public static double sum(ArrayList<Double> list){
        double sum = 0;
        //iterate through array
        for(int i = 0; i < list.size(); i++){
            sum+= list.get(i);
        }

        return sum;
    }
}
