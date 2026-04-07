package Backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _40_combination_sum_ii
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/25 12:34
 * @Version 1.0
 */
public class _40_combination_sum_ii {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        List<List<Integer>> list = solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(list);
    }
}

/**
 * 树层去重 和 树枝去重
 *
 * 树层去重是因为，排序后的元素，当前一个元素和后一个元素相同时，
 * 前一个元素递归后的结果集，已经包含了后一个元素的，需要在循环中跳过当次循环；
 *
 * 但是因为两个元素在同一个集合中是可以出现的，所以要保留类似[112]的树枝，
 * 因此当used[i-1]==used[i]，其实是处于树枝状态，
 * 要判断user[i-1]=false，前一个元素没有取，才是树层状态
 */
class Solution4 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    int sum = 0;
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        backTracking(candidates, target, 0);
        return res;
    }

    public void backTracking(int[] candidates, int target, int startIndex) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            if (i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == false) {
                continue;
            }
            sum += candidates[i];
            path.add(candidates[i]);
            used[i] = true;
            backTracking(candidates, target, i + 1);
            sum -= candidates[i];
            path.removeLast();
            used[i] = false;
        }
    }


}
