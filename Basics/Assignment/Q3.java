package Assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
        System.out.print("Enter Principle, Rate and Time : ");
        int P = in.nextInt();
        int R = in.nextInt();
        int T = in.nextInt();

        int simpleInterest = (P * R * T) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
