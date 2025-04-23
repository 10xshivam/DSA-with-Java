package Methods;

public class DecimalToBinary {
    public static int getDecimal(int n){
        int binary = 0;
        int power = 0;
        while (n > 0) {
            binary += (n % 2) * Math.pow(10,power++);
            n /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println(getDecimal(7));
    }
}
