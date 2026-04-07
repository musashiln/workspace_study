package Backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: _47_permutations_ii
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/29 20:56
 * @Version 1.0
 */
public class _47_permutations_ii {
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        List<List<Integer>> list = solution.permuteUnique(new int[]{1, 1, 2});
        System.out.println(list);
    }
}

class Solution11 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
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
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backTracking(nums, used);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
