package Methods.Assignment;

import java.util.Scanner;

public class Q14 {
    static void getPrimeNumbers(int start, int end){
        int i = start;
        while (i <= end) {
            boolean isPrime = true;
            
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers to find Prime Numbers between them: ");
        int start = in.nextInt();
        int end = in.nextInt();
        getPrimeNumbers(start, end);
        in.close();
    }
}
