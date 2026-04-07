package Backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: _90_subsets_ii
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/26 22:07
 * @Version 1.0
 */
public class _90_subsets_ii {
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        List<List<Integer>> list = solution.subsetsWithDup(new int[]{1, 2, 2});
        System.out.println(list);
    }
}

/**
 * 与78区别在于数组中有重复元素，但是要求子集不重复
 * 相当于 40组合总和ii + 78子集
 */
class Solution8 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);   //注意要排序
        backTracking(nums, 0, used);
        return res;
    }

    public void backTracking(int[] nums, int startIndex, boolean[] used) {
        res.add(new ArrayList<>(path));
        for (int i = startIndex; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backTracking(nums, i + 1, used);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
