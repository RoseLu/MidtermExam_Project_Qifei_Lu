/**
 * Created by qiqi on 2016/10/28.
 */
public class MaxProfit {

    /*One way to solve the problem, much easier than another way, although the result is correct, the logic of this way
    conflicts with the requirement of "not engage in multiple transactions at the same time"
     */
    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }

    /*One way to solve the problem, and its logic meets all the requirement and could be used in reality*/
    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int total = 0;
        int i = 0;
        while (i < prices.length) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) i++;// find the price that could be buy
            int minPrice = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) i++;//find the price that could be sold
            total += (i < prices.length? prices[i] - minPrice: 0);
            i++;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        MaxProfit mp = new MaxProfit();
        System.out.println(mp.maxProfit1(prices));//Output:7
        System.out.println(mp.maxProfit2(prices));//Output:7
    }
}
