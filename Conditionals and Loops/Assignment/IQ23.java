package Assignment;

import java.util.Scanner;

public class IQ23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = in.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap year.");
        } else {
            System.out.println("Not Leap year.");
        }

        in.close();
    }
}
