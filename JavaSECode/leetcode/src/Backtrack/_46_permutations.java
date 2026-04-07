package Backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _46_permutations
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/28 21:38
 * @Version 1.0
 */
public class _46_permutations {
    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        List<List<Integer>> list = solution.permute(new int[]{1, 2, 3});
        System.out.println(list);

    }
}

/**
 * 递归后怎么取值？
 * used数组标记
 */

class Solution10 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backTracking(nums, used);
        return res;
    }

    public void backTracking(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backTracking(nums, used);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
