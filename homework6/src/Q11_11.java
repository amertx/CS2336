
import java.util.*;

public class Q11_11 {

    public static void main(String[] args) {
        //Scanner object creation
        Scanner kb = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.print("Enter 5 numbers: ");
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        num3 = kb.nextInt();
        num4 = kb.nextInt();
        num5 = kb.nextInt();

        //arraylist creation
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);

        sort(list);
        System.out.print(list);

    }

    public static void sort(ArrayList<Integer> list){
        int store;

        for(int i = 0; i < list.size()-1; i++){
            //adding an index to check the consecutive index
            for(int k = i+1; k < list.size(); k++){
                if(list.get(k) < list.get(i));
                store = list.get(i);
                //swap
                list.set(i, list.get(k));
                list.set(k, store);
            }
        }
    }

}


