package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int index = 0; index < 3; index++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int index = 0; index < 3; index++) {
                list.get(i).add(in.nextInt());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int index = 0; index < 3; index++) {
                System.out.print(list.get(i).get(index) + " "); 
            }
            System.out.println();
        }

        System.out.println(list);
    }
}
