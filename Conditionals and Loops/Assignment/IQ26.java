package Assignment;

import java.util.Scanner;

public class IQ26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int negSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        while (true) {
            int n = in.nextInt();

            if(n == 0){
                break;
            }

            if(n < 0){
                negSum += n;
            }

            if(n % 2 == 0){
                evenSum += n;
            }

            if(n % 2 != 0){
                oddSum += n;
            }
        }

        System.out.println("Sum of negative numbers = " + negSum);
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);

        in.close();
    }
}
