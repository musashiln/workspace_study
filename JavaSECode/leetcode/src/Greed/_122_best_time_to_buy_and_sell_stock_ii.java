package Greed;

/**
 * ClassName: _122_best_time_to_buy_and_sell_stock_ii
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/10 7:52
 * @Version 1.0
 */
public class _122_best_time_to_buy_and_sell_stock_ii {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] nums = {7,1,5,3,6,4};
        System.out.println(solution3.maxProfit(nums));
    }
}

class Solution3 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            sum += Math.max(prices[i] - prices[i - 1], 0);
        }
        return sum;
    }
}
