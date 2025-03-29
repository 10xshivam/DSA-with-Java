package Assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        System.out.print("Enter the operation(+, -, *, /) : ");
        String op = in.next();

        int result = 0;

        if (op.charAt(0) == '+') {
            result = num1 + num2;
        }

        if (op.charAt(0) == '-') {
            result = num1 - num2;
        }

        if (op.charAt(0) == '*') {
            result = num1 * num2;
        }

        if (op.charAt(0) == '/') {
            result = num1 / num2;
        }

        System.out.println("Result = " + result);

        in.close();
    }
}
