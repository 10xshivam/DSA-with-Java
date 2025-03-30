package Assignment;

import java.util.Scanner;

public class IQ17 {
    static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = n;
        while(temp > 0){
            reverse = (reverse*10) + temp % 10;
            temp /= 10;
        }
        return n == reverse;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Number is not Palindrome.");
        }
        in.close();
    }
}
