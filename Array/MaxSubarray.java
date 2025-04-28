package Array;

public class MaxSubarray {
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
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(maxSubarrayBF(arr));
    }
}
