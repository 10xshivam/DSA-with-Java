import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.err.print
        ("Enter the character : ");
        char ch = n.nextLine().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z' ) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}