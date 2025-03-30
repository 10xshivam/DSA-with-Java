package Assignment;

import java.util.Scanner;

public class IQ16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Enter the String u want to reverse : ");
            String str = in.next() ;

            for (int i = (str.length() - 1) ; i >= 0 ; i--) {
                System.out.print(str.charAt(i));
            }
            in.close();
    }
}
