package Methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        printNumber(1,2,3,4,5,6);
    }

    static void printNumber(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
