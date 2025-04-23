package Methods;

public class BinaryToDecimal {
    public static int getBinary(int n){
        int decimal = 0;
        int power = 0;
        while (n > 0) {
            decimal += (n % 10) * Math.pow(2,power++);
            n /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(getBinary(101));
    }
}