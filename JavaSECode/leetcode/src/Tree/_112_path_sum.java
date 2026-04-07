package Tree;

import java.util.List;

/**
 * ClassName: _112_path_sum
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/21 9:27
 * @Version 1.0
 */
public class _112_path_sum {
    public static void main(String[] args) {
        Integer[] nums1 = {1};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution13 solution = new Solution13();
        System.out.println(solution.hasPathSum(root1, 1));
    }
}

class Solution13 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        if (root.left != null) {
            if (hasPathSum(root.left, targetSum)) return true;
        }
        if (root.right != null) {
            if (hasPathSum(root.right, targetSum)) return true;
        }
        return false;
    }
}
