package Backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _77_combinations
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/24 9:20
 * @Version 1.0
 */
public class _77_combinations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> res = solution.combine(4,2);
        System.out.println(res);
    }
}

/**
 * 不理解可以跟断点走一遍
 *
 * 注意res.add(new ArrayList<>(path));
 * 一定要new 一个新对象，因为只是将原path变量加进去，后面path内容做修改，res的内容也会改变，
 * 因为都指向同一个内存空间
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n ,k, 1);
        //backTracking1(n ,k, 1);
        return res;
    }

    public void backTracking(int n ,int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        //startIndex 用来记录本层递归的中，集合从哪里开始遍历
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backTracking(n, k, i + 1);
            path.removeLast();
        }
    }

    /**
     * 剪枝
     * 通过控制循环的终止次数，剪掉不需要的子树
     * 本题中含义是至多从哪里开始遍历，能够选择到足够长的路径
     * k-path.size表示剩余需要选择的路径长度，
     * n-(k-path.size)+1表示从这个位置开始遍历，正好能获得最后一个path，也就是所有剩余元素都包含的path，再往后遍历就不够了
     */
    public void backTracking1(int n ,int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        //startIndex 用来记录本层递归的中，集合从哪里开始遍历
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backTracking1(n, k, i + 1);
            path.removeLast();
        }
    }

}
