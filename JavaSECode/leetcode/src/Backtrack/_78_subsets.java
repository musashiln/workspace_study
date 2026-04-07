package Backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _78_subsets
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/26 20:38
 * @Version 1.0
 */
public class _78_subsets {
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        List<List<Integer>> list = solution.subsets(new int[]{1, 2, 3});
        System.out.println(list);
    }
}

/**
 * 怎么确定终止条件?
 * 当集合中没有元素可以加入，也就是startIndex遍历到最后时，就可以终止了；
 * 实际上终止条件也可以不加，因为如果继续进入for循环，也会因为不满足for循环条件退出
 *
 * 和组合问题的区别在于：
 * 组合问题是收集叶子节点的结果；
 * 子集问题是收集所有节点的结果；因为每取一个元素都形成了一个子集
 *
 * 收集结果放在哪里？
 * 每一次递归进入后就收集结果
 * 能不能放在for循环：不能，会把空集结果丢掉
 */
class Solution7 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return res;
    }

    public void backTracking(int[] nums, int startIndex) {
        res.add(new ArrayList<>(path));
        if (startIndex >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backTracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}