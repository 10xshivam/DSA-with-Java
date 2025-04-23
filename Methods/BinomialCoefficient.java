package Methods;

public class BinomialCoefficient {
    public static int  getFact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 5 ,r = 2;
        int nCr = getFact(n) / (getFact(r) * getFact(n-r));
        System.out.println(nCr);
    }
}
