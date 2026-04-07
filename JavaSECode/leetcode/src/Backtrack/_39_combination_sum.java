package Backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _39_combination_sum
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/25 11:20
 * @Version 1.0
 */
public class _39_combination_sum {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        List<List<Integer>> res = solution.combinationSum(new int[]{2, 5, 3}, 8);
        System.out.println(res);
    }
}

/**
 * 与216不同是，没有规定path中元素的个数，也就是递归深度不确定
 *
 * 终止条件中有sum == target和sum > target两种情况，其中>情况可以剪枝
 * 如果是写成
 * if (sum > target) return;
 * 实际上是本层循环每一次都调用了递归，递归每次返回空；
 * 而for循环中if剪枝，是直接跳出了本层循环
 *
 * 剪枝一般在for循环中操作，
 * 因为提前已经排序，所以当前的sum与当前循环遍历到的值相加已经大于target，可以直接跳过循环
 * 比如235，如果target=4,当第一层循环取3，3<4，3进入递归，进到3的循环中，在[35]中取值，3+3>4，跳出3的循环，剪枝了[33]和[35](没有执行)，
 * 然后回到第一层循环取5，5>4，直接跳出第一层循环
 *
 * index取法：
 * 如果需要排除重复组合，for (i = startIndex；)
 * 如果需要排除重复元素，修改递归传入的startIndex
 */
class Solution3 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates, target, 0, 0);
        return res;
    }

    public void backTracking(int[] candidates, int target, int sum, int startIndex) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            sum += candidates[i];
            path.add(candidates[i]);
            backTracking(candidates, target, sum, i);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
