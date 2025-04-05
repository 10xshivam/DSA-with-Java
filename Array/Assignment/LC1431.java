package Array.Assignment;

import java.util.ArrayList;
import java.util.List;

public class LC1431 {
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            int max = candies[i] + extraCandies;
            System.out.println(max);
            boolean result = true;
            for(int j = 0; j < candies.length; j++){
                if(max <= candies[j]){
                    result = false;
                }
            }
            System.out.println(result);
            list.add(result);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
