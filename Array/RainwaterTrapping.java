package Array;

public class RainwaterTrapping {
    public static int trappedWater(int[] height){
        int n = height.length;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int clm = height[0];
        int crm = height[height.length-1];
         for (int i = 0; i < leftMax.length; i++) {
            if (height[i] > clm) {
                clm = height[i];
                leftMax[i] = clm;
            } else {
                leftMax[i] = clm;
            }
         }
         for (int i = leftMax.length-1; i >= 0 ; i--) {
            if (height[i] > crm) {
                crm = height[i];
                rightMax[i] = crm;
            } else {
                rightMax[i] = crm;
            }
         }

         int ttw = 0;

         for (int i = 0; i < height.length; i++) {
            int wl = Math.min(leftMax[i], rightMax[i]);
            int tw = wl-height[i];
            if(tw < 0){
                tw = 0;
            }
            ttw += tw;
         }

         System.out.println("Total rainwater : " + ttw);
         System.out.println("Total rainwater : " + trappedWater(height));

    }
}
