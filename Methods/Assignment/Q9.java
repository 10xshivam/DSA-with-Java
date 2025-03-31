package Methods.Assignment;

import java.util.Scanner;

public class Q9 {
    static void factorial(int n){
        if(n <= 1){
            System.out.println(n + "! = 1");
            return;
        }
        
        System.out.print(n + "! = ");
        
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " * ");
            factorial *= i ;
        }
        System.out.println(" = " + factorial);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        factorial(num);
    }
}
