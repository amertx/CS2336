
import java.util.*;

public class Q10_6 {

    public static void main(String[] args) {
        // write your code here
        StackOfIntegers stack = new StackOfIntegers();
        int num = 0;
        for (int i = 1; i <= 120; i++) {
            int counter = 0;

            //increase counter if the number is divisible by itself
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                stack.push(i);

            }

        }
        //allows a reversal printing of prime numbers from 120 to 1
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}


class StackOfIntegers {
    int[] elements;
    int size;
    public static final int DEFAULT_CAPACITY = 16;

    StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    StackOfIntegers(int capacity) {
        elements = new int[capacity];

    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}

