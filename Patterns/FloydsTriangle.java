package Patterns;

public class FloydsTriangle {
    public static void getPattern(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getPattern(10);
    }
}
