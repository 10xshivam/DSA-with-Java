package Assignment;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers to find Armstrong numbers between them: ");
        int start = in.nextInt();
        int end = in.nextInt();

        int i = start;
        while (i <= end) {
            int result = 0;
            int temp = i;  
            
            while (temp > 0) {
                int digit = temp % 10;
                result += digit*digit*digit; 
                temp /= 10;
            }

            if(result == i){
                System.out.print(i + " ");
            } 
            
            i++;
        }
        in.close();
    }
}
