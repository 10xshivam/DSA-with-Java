import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num  = input.nextInt();
        int ans = 0;

        while (num > 0) {
            int rem = num % 10 ;
            // System.out.print(rem); 
            ans = ans * 10 + rem;
            num /= 10;
        }

        System.out.print("Reversed Number : "+ans);
    }
}
