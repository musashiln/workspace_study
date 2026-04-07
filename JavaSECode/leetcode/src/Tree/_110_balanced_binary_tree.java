package Tree;

import java.util.List;

/**
 * ClassName: _110_balanced_binary_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/20 11:22
 * @Version 1.0
 */
public class _110_balanced_binary_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {3,9,20,null,null,15,7};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution9 solution = new Solution9();
        System.out.println(solution.isBalanced(root1));
    }
}

class Solution9 {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight,rightHeight) + 1;
    }
}
