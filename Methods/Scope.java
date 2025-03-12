package Methods;

public class Scope {
    public static void main(String[] args) {
        int rollno = 45; //anything inialized outside can be used inside the block,  but cannot be initialised

        // block scope
        {
             rollno = 5; //updating
             String name = "Shivam"; // anything inialized inside cannot be used outside the block, but can be initialised
        }
        String name = "Shivam";
    }
    
    // same in loop scope
    
}
