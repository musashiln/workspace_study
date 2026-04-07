package Backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: _491_non_decreasing_subsequences
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/28 20:48
 * @Version 1.0
 */
public class _491_non_decreasing_subsequences {
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        List<List<Integer>> list = solution.findSubsequences(new int[]{4,6,7,7});
        System.out.println(list);
    }
}

/**
 * 和90子集ii的相同点
 * 都是收集所有节点(不包括size==1)上的结果，都需要树层上去重
 * 其实90用set也能通过
 *
 * 和90子集ii的区别在于
 * 不是顺序的，所以不能用一个used数组判断相邻元素，而是用集合来确定是否有重复的取值
 * 因为是在树层上去重，所以每一层都定义一个新的set
 */
class Solution9 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracing(nums, 0);
        return res;
    }

    public void backTracing(int[] nums, int startIndex) {
        if (path.size() >= 2) {
            res.add(new ArrayList<>(path));
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            if ( !path.isEmpty() && nums[i] < path.get(path.size() - 1) || hashSet.contains(nums[i])) {
                continue;
            }
            hashSet.add(nums[i]);
            path.add(nums[i]);
            backTracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
