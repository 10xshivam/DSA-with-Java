package Assignment;

import java.util.Scanner;

public class IQ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle,Rate and Time : ");
        double P = in.nextDouble();
        double R = in.nextDouble();
        double T = in.nextDouble();

        double amount = P * Math.pow((1 + R/100) , T);

        System.out.println("Total Amount = " + amount);
        System.out.println("Compound Interest = " + (amount-P));
        in.close();
    }
}
