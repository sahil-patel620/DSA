package Arrays.Practices;

// same as stocks buy and sell 
public class Q3MaxProfitFromStock {
    public static int maxStockProfit(int prices[]) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit = " + maxStockProfit(prices));
    }
}
