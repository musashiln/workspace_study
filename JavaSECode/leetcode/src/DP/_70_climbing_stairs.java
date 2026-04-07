package DP;

/**
 * ClassName: _70_climbing_stairs
 * Package: DP
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/21 20:34
 * @Version 1.0
 */
public class _70_climbing_stairs {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.climbStairs(3));
    }
}

/**
 * 1阶 1
 * 2阶 2
 * 3阶 3
 * 4阶
 * 到3阶这样走：
 * 从1阶上来，直接走2阶
 * 从2阶上来：直接走1阶
 *
 * f(3) = f(1)+1+f(2)
 *
 * dp[i] 走到i有多少种方法
 * 递推公式 dp[i] = dp[i - 1] + dp[i - 2]
 * 初始化 dp[0] = 1, dp[1] = 1
 * 顺序 从前到后
 * 打印dp数组
 */
class Solution1 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
        return dp[n];
    }
}
