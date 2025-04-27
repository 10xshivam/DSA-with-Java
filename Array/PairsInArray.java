package Array;

public class PairsInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int n = arr.length;
        int tp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total pairs: " + tp);
        System.out.println("Total pairs: " + (n*(n-1)/2));
    }
}
