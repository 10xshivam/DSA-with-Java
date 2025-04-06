package Array.Assignment;

import java.util.ArrayList;
import java.util.List;

public class LC1431 {
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for(int i = 0; i < candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            list.add(max <= candies[i]+ extraCandies);
        }
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
