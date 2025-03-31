package Methods.Assignment;

import java.util.Scanner;

public class Q1 {
    static int getMax(int a, int b, int c){
        int max = 0;
        if(a > b){
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }
    static int getMin(int a, int b, int c){
        int min = 0;
        if(a < b){
            if (a < c) {
                min = a;
            } else {
                min = c;
            }
        } else {
            if (b < c) {
                min = b;
            } else {
                min = c;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the three numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("Maximum Number = " + getMax(num1, num2, num3));
        System.out.println("Minimum Number = " + getMin(num1, num2, num3));
        in.close();
    }
}