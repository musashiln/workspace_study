package Tree;

import java.util.List;

/**
 * ClassName: _111_minimum_depth_of_binary_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/19 13:49
 * @Version 1.0
 */
public class _111_minimum_depth_of_binary_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {3,9,20,null,null,15,7};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution7 solution = new Solution7();
        System.out.println(solution.minDepth(root1));
    }
}

/**
 * 与最大深度思路一致，使用后序遍历，
 * 关键在于是到叶结点的距离，也就是分支节点的子树为空，这种情况不能算进去
 */
class Solution7 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        if (leftHeight == 0) {
            return rightHeight + 1;
        }
        if (rightHeight == 0) {
            return leftHeight + 1;
        }
        return 1 + Math.min(leftHeight, rightHeight);
    }
}