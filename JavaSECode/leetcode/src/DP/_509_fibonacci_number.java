package DP;

/**
 * ClassName: _509_fibonacci_number
 * Package: DP
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/21 19:45
 * @Version 1.0
 */
public class _509_fibonacci_number {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(4));
        System.out.println(solution.fib1(4));
    }
}

class Solution {

    public int fib(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
        return dp[n];
    }

    /**
     *ตÝน้
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
}

