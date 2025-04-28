package Array;

public class Subarrays {
    public static void printSubarrays(int[] arr){
        int max = 0, min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k] + " " );
                    sum += arr[k];
                }
                System.out.print(sum);
                System.out.print(" ");
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
            System.out.println();
        }
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubarrays(arr);
    }
} 
