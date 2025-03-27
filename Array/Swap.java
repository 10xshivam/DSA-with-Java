package Array;

public class Swap {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 0, 1};

        swap(arr, 4, 1);
        System.out.println("Swapping the numbers...");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}