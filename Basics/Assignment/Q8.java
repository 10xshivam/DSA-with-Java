package Assignment;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");

        String str = in.next();

        int left = 0;
        int right = str.length() - 1;
        boolean result = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                result = false;
                break;
            }
            left++;
            right--;
        }

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        in.close();
    }
}
