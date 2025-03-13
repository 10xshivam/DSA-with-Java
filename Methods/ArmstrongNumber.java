package Methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num = n.nextInt();

        if (checkArmstrong(num)) {
        System.out.println("Number is Armstrong");
        } else {
        System.out.println("Number is not Armstrong");
        }
        
        // Prints all three digit Armstrong Numbers
        for (int i = 100; i < 1000; i++) {
            if (checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean checkArmstrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num /= 10;
        }
        return sum == original;
    }
}
