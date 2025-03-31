package Methods.Assignment;

import java.util.Scanner;

public class Q7 {
    static boolean checkPrime(int num){
        boolean isPrime = true;
        if( num <= 1 ){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        if (checkPrime(num)) {
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is not Prime.");
        }
        in.close();
    }
}
