package DP;

import java.util.concurrent.ForkJoinPool;

/**
 * ClassName: _62_unique_paths
 * Package: DP
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/22 21:34
 * @Version 1.0
 */
public class _62_unique_paths {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.uniquePaths(3, 7));
    }
}

/**
 * dp[i][j]到达[i,j]有多少条路径
 * 递推公式：dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
 * 初始化 d[0][j] = 1, d[i][0] = 1
 * 顺序 两层for循环从左到右，从上到下
 * 打印
 */
class Solution3 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n -1];
    }
}
