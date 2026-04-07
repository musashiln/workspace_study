package Tree;

import java.util.List;

/**
 * ClassName: _104_maximum_depth_of_binary_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/19 13:10
 * @Version 1.0
 */
public class _104_maximum_depth_of_binary_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {3,9,20,null,null,15,7};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution6 solution = new Solution6();
        System.out.println(solution.maxDepth(root1));
    }
}

/**
 * 最大深度，其实就是根节点的高度，求高度，用后序遍历
 */
class Solution6 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
