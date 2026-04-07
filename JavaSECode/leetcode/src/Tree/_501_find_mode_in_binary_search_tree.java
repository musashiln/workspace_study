package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _501_find_mode_in_binary_search_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/22 10:03
 * @Version 1.0
 */
public class _501_find_mode_in_binary_search_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {1,null,2,2};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution21 solution = new Solution21();
        int[] res = solution.findMode(root1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

/**
 * 如果按照遍历两遍的方法，需要在第一次遍历中将出现的频率统计到map，再排序map，再输出到结果集，
 * 而使用一次遍历的方法，是在比较中途就更新结果集，每找到一个频率更高的数，就清空结果集重新添加
 */
class Solution21 {
    List<Integer> list = new ArrayList<>();
    TreeNode pre = null;
    int count = 0;
    int maxCount = 0;

    public int[] findMode(TreeNode root) {
        traversal(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        if (pre == null) {
            count = 1;
        } else if (pre.val != root.val) {
            count = 1;
        } else {
            count++;
        }
        pre = root;
        if (count == maxCount) {
            list.add(root.val);
        }
        if (count > maxCount) {
            list.clear();
            list.add(root.val);
            maxCount = count;
        }
        traversal(root.right);
    }
}
