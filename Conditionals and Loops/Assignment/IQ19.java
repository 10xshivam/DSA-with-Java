package Assignment;

import java.util.Scanner;

public class IQ19 {
    static int getHCF(int a, int b){
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int HCF = getHCF(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " = " + HCF);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + (num1 * num2 / HCF));

        in.close();
    }
}