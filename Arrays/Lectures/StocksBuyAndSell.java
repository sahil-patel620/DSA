package Arrays.Lectures;

public class StocksBuyAndSell {
    public static int maxProfitFromStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; // updating buyPrice if today's price is less previous buyPrice
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };                   //time complexity O(n)
        System.out.println("Maximum Profit = " + maxProfitFromStocks(prices));
    }
}
