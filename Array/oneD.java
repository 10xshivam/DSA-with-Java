package Array;

import java.util.Arrays;
import java.util.Scanner;

public class oneD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        // First method
        // for(int i = 0; i < arr.length; i++){
        //    System.out.print(arr[i]+ " "); 
        // }

        // Second method
        // for(int number: arr){
        //     System.out.print(number+ " ");
        // }

        // Third method
        System.out.print(Arrays.toString(arr));

    }
}
