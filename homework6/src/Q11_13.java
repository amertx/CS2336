
import java.util.*;

public class Q11_13 {

    public static void main(String[] args) {
        //Scanner object creation
        Scanner kb = new Scanner(System.in);
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        System.out.print("Enter 10 numbers: ");
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        num3 = kb.nextInt();
        num4 = kb.nextInt();
        num5 = kb.nextInt();
        num6 = kb.nextInt();
        num7 = kb.nextInt();
        num8 = kb.nextInt();
        num9 = kb.nextInt();
        num10 = kb.nextInt();

        //arraylist creation
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        list.add(num6);
        list.add(num7);
        list.add(num8);
        list.add(num9);
        list.add(num10);

        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }

    public static void removeDuplicate(ArrayList<Integer> list){
        //first loop is the first element that is compared
        for(int i = 0; i < list.size()-1; i++){
            //seond loop is the consecutive element in the list
            for(int k = i + 1; k < list.size(); k++){
                if(list.get(i) == list.get(k)){
                    list.remove(k);
                }
            }
        }
    }

}
