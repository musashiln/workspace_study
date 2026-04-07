package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _257_binary_tree_paths
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/20 13:32
 * @Version 1.0
 */
public class _257_binary_tree_paths {
    public static void main(String[] args) {
        Integer[] nums1 = {1,2,3,null,5};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution10 solution = new Solution10();
        List<String> list = solution.binaryTreePaths(root1);
        System.out.println(list);
    }
}

/**
 * 当使用递归后就要回溯
 * 回溯到上一个能够继续处理的节点
 */
class Solution10 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        traversal(root, res, path);
        return res;
    }

    public void traversal(TreeNode root, List<String> res, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                stringBuilder.append(path.get(i));
                stringBuilder.append("->");
            }
            stringBuilder.append(path.get(path.size() - 1));
            res.add(stringBuilder.toString());
            return;
        }
        if (root.left != null) {
            traversal(root.left, res, path);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            traversal(root.right, res, path);
            path.remove(path.size() - 1);
        }
    }
}