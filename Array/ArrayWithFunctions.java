package Array;

public class ArrayWithFunctions {
    public static void main(String[] args) {
        // int[] arr = {1,3,4,5,2};
        String[] arr = {"Rashmi", "Kamla" , "Laila"};
        System.out.println("Before change: " + arr[0]);
        change(arr);
        System.out.println("After change: " + arr[0]);
    }

    static void change(int[] num){
        num[0] = 5;
    }

    static void change(String[] name){
        name[0] = "Shivam";
    }
}
