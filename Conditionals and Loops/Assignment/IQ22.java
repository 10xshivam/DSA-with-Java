package Assignment;

import java.util.Scanner;

public class IQ22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

        in.close();
    }
}
