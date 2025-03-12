package Methods;

public class Scope {
    public static void main(String[] args) {
        int rollno = 45;
        {
             rollno =5;
        }
    }
    
    static void greet(){
        String name =  "Shivam";
        System.out.println("Hello Everyone");
    }
}
