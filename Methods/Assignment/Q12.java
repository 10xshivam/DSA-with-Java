package Methods.Assignment;

import java.util.Scanner;

public class Q12 {
    static boolean checkTriplet(double a, double b, double c){
        boolean isTriplet = false;

        c =  Math.pow(c, 2);

        double sum = Math.pow(a, 2) + Math.pow(b, 2);


        if (c == sum){
            isTriplet = true;
        }

        return isTriplet;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the three numbers : ");
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        double num3 = in.nextInt();
        
        if (checkTriplet(num1, num2, num3)) {
            System.out.println("Pythagorean triplets");
        } else {
            System.out.println(" Not Pythagorean triplets");
        }

        in.close();
    }
}
