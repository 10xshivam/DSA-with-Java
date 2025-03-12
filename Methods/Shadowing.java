package Methods;

public class Shadowing {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);

        int x = 20; // class variable shadowed by this 
        System.out.println(x);
    }
}
