package Array;

public class MaxValue {
    public static void main(String[] args) {

        int[] arr = {3, 6, 2, 1, 8};

        System.out.println("Maximum is: " + max(arr));
        System.out.println("Maximum is: " + max(arr, 1, 3));

    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int max(int[] arr, int start, int end){
        if(start > end){
            return -1
        }

        if(arr == null){
            return -1
        }

        int max = arr[0];
        for (int i = start; i < end; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
