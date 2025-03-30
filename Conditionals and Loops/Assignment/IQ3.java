package Assignment;

import java.util.Scanner;

public class IQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Average of how much numbers : ");
        int n = in.nextInt();
        System.out.print("Enter the numbers : ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            sum += num;
        }

        int avg = sum / n;

        System.out.println("Average of " + n + " numbers is " + avg);
        in.close();
    }
}
