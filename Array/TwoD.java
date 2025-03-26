package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][3];
        // OR
        int[][] arr = {
            {1,2,3},
            {1,4,3,5,6},
            {3,1,3}
        };

        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //         arr[row][col] = in.nextInt();
        //     }
        // }

        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] row :arr){
            for(int col:row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
