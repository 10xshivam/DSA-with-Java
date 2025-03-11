import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the operator : ");

            char calc = input.next().trim().charAt(0);

            if (calc == '+' || calc == '-' || calc == '*' || calc == '/' || calc == '%' ) {
                System.out.print("Enter the numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                input.nextLine(); 

                if(calc == '+'){
                    ans = num1 + num2;
                }
                if(calc == '-'){
                    ans = num1 - num2;
                }
                if(calc == '*'){
                    ans = num1 * num2;
                }
                if(calc == '/'){
                    if(num2 != 0){  
                        ans = num1 / num2;
                    }
                }
                if(calc == '%'){
                    ans = num1 % num2;
                }

                System.out.println(ans);
            } else if (calc == 'x' || calc == 'X'){
                break;
            } else{
                System.out.println("Enter the correct operator");
            }
        }
    }
}
