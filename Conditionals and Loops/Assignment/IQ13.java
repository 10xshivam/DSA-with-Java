package Assignment;

import java.util.Scanner;

public class IQ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number till u want the sum : ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum of " + n + " numbers is " + sum);
        in.close();
    }
    
}
