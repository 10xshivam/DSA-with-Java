package Assignment;

import java.util.Scanner;

public class IQ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Discount Percentage on the product : ");
        float disRate = in.nextFloat();
        System.out.print("Enter the Price of Product : ");
        float price = in.nextFloat();

        float discount = price * (disRate / 100);

        System.out.println("Discount Amount: Rs." + discount);
        System.out.println("Price after discount: Rs." + (price-discount));
        in.close();
    }
}
