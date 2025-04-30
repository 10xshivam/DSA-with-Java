package Array;

public class BuySellStock {
    public static int buySellStocks(int[] price){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] price  = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit : " + buySellStocks(price));
    }
}
