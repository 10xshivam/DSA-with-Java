package Array;

public class MaxSubarray {
    // Brute Force 
    public static int maxSubarrayBF(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    // Prefix Array
    public static int maxSubarrayPA(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = i == 0 ? prefix[j]:prefix[j] - prefix[i-1];
                max = Math.max(max, sum);
            }
            System.out.println();
        }
        return max;
    }
    
    // Kadane's Algorithm
    public static int kadanealgo(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] arr = {2,4,6,8,10};
        int[] arr = {-2,-3,4,-1,-2,1,5,-3}; 
        // int[] arr = {-1,-2,-3,-4}; // for KA as it gives zero for all negative numbers
        System.out.println(maxSubarrayBF(arr));
        System.out.println(maxSubarrayPA(arr));
        System.out.println(kadanealgo(arr));
    }
}
