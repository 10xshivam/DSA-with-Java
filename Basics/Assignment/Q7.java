package Assignment;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();

        if (n <= 1) {
            in.close();
            return;
        }

        int num1 = 0, num2 = 1, result = 0;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < n; i++) {
            result = num1 + num2;
            System.out.print(result + " ");

            num1 = num2;
            num2 = result;
        }

        in.close();
    }
}
