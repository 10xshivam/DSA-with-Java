package Methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num = n.nextInt();
        Boolean ans = checkPrime(num);
        if(ans == false){
            System.out.println(num+" is not Prime.");
        } else {
            System.out.println(num+" is Prime.");
        }
    }

    static Boolean checkPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false; 
            } 
        }
        return true;
    }
}
