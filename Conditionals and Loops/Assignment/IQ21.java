package Assignment;

import java.util.Scanner;

public class IQ21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char n = in.next().charAt(0);

        if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
            System.out.println("Consonant");
        } else {
            System.out.println("Vowel");
        }

        in.close();
    }
}
