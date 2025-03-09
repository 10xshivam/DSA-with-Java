import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int n = input.nextInt();

        int a = 0;
        int b = 1;
        System.err.print(a+" "+b+" ");

        int count = 2;

        while(count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b+" ");
            count++;
        }

    }
}
