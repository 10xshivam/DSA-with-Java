package Assignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in INR : ");
        int amount = in.nextInt();

        float exchangeRate = 85.399f;

        float convert = amount / exchangeRate;

        System.out.println(amount + " INR"  + " = " + convert + " USD");
    }
}
