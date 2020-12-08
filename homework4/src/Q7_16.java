

import java.util.*;

public class Q7_16 {

    public static void main(String[] args) {
        // write your code here
        int [] array = new int[100000];
        int keyValue = getRandomInteger();
        for(int i = 0; i < array.length; i++){
            array[i] = getRandomInteger();
        }

        //utilizing linear search
        int search = 0;
        long startTime = System.currentTimeMillis();
        search = linearSearch(keyValue, array);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time using linear search:  " + executionTime);

        //sorting the array
        sort(array);

        //utilizing binary search
        startTime = System.currentTimeMillis();
        search = binarySearch(keyValue, array);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time using binary search:  " + executionTime);
    }

    //produce 100000 random integers
    public static int getRandomInteger(){
        return 1 + (int)(Math.random() * 100000);
    }

    //sorting function
    public static void sort(int [] array){
        int count = 0;
        int temp = 0;
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //linear search
    public static int linearSearch(int key, int [] array){
        for(int i = 0; i < array.length; i++){
            if(key == array[i]){
                return i;
            }
        }
        return -1;
    }

    //binary search
    public static int binarySearch(int key, int [] array){
        int min = 0;
        int max = array.length-1;
        int midpoint;
        while(min <= max){
            midpoint = (min + max) / 2;
            if(array[midpoint] < key){
                min = midpoint + 1;
            }else if(array[midpoint] > key){
                max = midpoint - 1;
            }else{
                return midpoint;
            }
        }

        return -1;
    }

}
