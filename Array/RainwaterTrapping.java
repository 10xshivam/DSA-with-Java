package Array;

public class RainwaterTrapping {
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

    }
}
