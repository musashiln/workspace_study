package Backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _216_combination_sum_iii
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/24 11:55
 * @Version 1.0
 */
public class _216_combination_sum_iii {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        List<List<Integer>> res = solution.combinationSum3(3,9);
        System.out.println(res);
    }
}

class Solution1 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 0, 1);
        return res;
    }

    /**
     * 与77组合不同的是增加了对sum的限制
     *
     * 剪枝条件1：
     * 继续从当前位置循环遍历剩下的元素，已经不够k个
     *
     * 剪枝条件2：
     * 加入当前元素后，sum已经超过所需的n
     *
     * @param k
     * @param n
     * @param sum
     * @param startIndex
     */
    public void backtracking(int k, int n, int sum, int startIndex) {
        if (sum > n) {
            return;
        }
        if (path.size() == k) {
            if (sum == n) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            sum += i;
            path.add(i);
            backtracking(k, n, sum, i + 1);
            sum -= i;
            path.removeLast();
        }
    }
}
