import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the EmpID : ");

        int ID = input.nextInt();
        String department = input.next();


        switch (ID) {
            case 1:
                System.out.println("Shivam");
                break;
            case 2:
                System.out.println("Kunal");
                break;
            case 3 :
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                
                    default:
                        System.out.println("No department entered");
                        break;
                }
        
            default:
                System.out.println("Enter the correct EmpID");
                break;
        }
    }
}
