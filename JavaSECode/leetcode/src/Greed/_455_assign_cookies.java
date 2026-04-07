package Greed;

import java.util.Arrays;

/**
 * ClassName: _455_assign_cookies
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/5 22:34
 * @Version 1.0
 */
public class _455_assign_cookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(g, s));
    }
}

/**
 * 尽可能让大的饼干，满足胃口大的孩子
 *
 * 循环怎么写：
 * 胃口作为外层循环，如果当前饼干不满足，外层循环自然会+1，用更小的胃口与当前饼干比较；
 * 直到当前饼干能够被分配，也就是执行了if中的语句，才会指向下一个饼干
 *
 *
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int index = s.length - 1;
        for (int i = g.length - 1; i >= 0 ; i--) {
            if (index >= 0 && s[index] >= g[i]) {
                res++;
                index--;
            }
        }
        return res;
    }
}
