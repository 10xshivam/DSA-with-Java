package Assignment;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int sum = 0;

        while (true) {
            int num = in.nextInt();
            if(num == 0){
                break;
            }
            sum += num;
        }

        System.out.println("Sum = " + sum);
        in.close();
    }
}
