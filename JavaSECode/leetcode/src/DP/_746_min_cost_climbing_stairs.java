package DP;

/**
 * ClassName: _746_min_cost_climbing_stairs
 * Package: DP
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/22 20:49
 * @Version 1.0
 */
public class _746_min_cost_climbing_stairs {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] cost = {10,15,20};
        int[] cost1 = {1,100,1,1,1,100,1,1,100,1};
        int i = solution2.minCostClimbingStairs(cost1);
        System.out.println(i);
    }
}

/**
 * dp[i]到达i时的最低花费
 * 递推公式 dp[i] = min((dp[i - 1] + cost[i - 1]),(dp[i - 2] + cost[i - 2]))
 * 初始化 dp[0] = 0, dp[1] = 0
 * 遍历顺序 从前到后
 * 打印dp
 */
class Solution2 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= dp.length - 1; i++) {
            dp[i] = Math.min((dp[i - 1] + cost[i - 1]),(dp[i - 2] + cost[i - 2]));
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
        return dp[dp.length - 1];
    }
}
