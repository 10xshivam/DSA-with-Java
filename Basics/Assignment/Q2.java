package Assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");

        String name = in.nextLine();

        System.out.println("Good Morning, " + name);
        in.close();
    }
}
