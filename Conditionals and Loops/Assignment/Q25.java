package Assignment;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int largest = 0;

        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (largest < num) {
                largest = num;
            }
        }
        System.out.println("Largest is " + largest);
        in.close();
    }   
}
