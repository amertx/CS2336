import java.util.*;

public class Q20_14 {

    public static void main(String[] args) throws IllegalArgumentException {
        // write your code here
        String[] expressions;
        switch (args.length) {
            //wrong format
            case 0: throw new IllegalArgumentException("Try Again with correct format");
            //split between each arugument and then store into array
            case 1: expressions = args[0].split(" ");
                break;
            default:
                expressions = args;
        }
        //creation of stacks
        Stack<Double> operands = new Stack<>();

        //iterate through each argument passed through command
        for(String expression: expressions){
            if(expression.charAt(0) == '*' || expression.charAt(0) == '-' || expression.charAt(0) == '+' || expression.charAt(0) == '/'){
                double pop1 = operands.pop();
                double pop2 = operands.pop();

                //allocate the expression
                switch (expression.charAt(0)){
                    case '*': {
                        operands.push(pop1 * pop2);
                        break;
                    }
                    case '+': {
                        operands.push(pop1 + pop2);
                        break;
                    }
                    case '-': {
                        operands.push(pop1 - pop2);
                        break;
                    }
                    case '/': {
                        operands.push(pop1 / pop2);
                        break;
                    }

                }
            }else{
                operands.push(Double.parseDouble(expression));
            }
        }

        System.out.println("Final outcome = " + operands.pop());


    }
}
