package Tree;

/**
 * ClassName: _530_minimum_absolute_difference_in_bst
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/22 8:54
 * @Version 1.0
 */
public class _530_minimum_absolute_difference_in_bst {
    public static void main(String[] args) {
        Integer[] nums1 = {4,2,6,1,3};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution20 solution = new Solution20();
        System.out.println(solution.getMinimumDifference(root1));
    }
}

class Solution20 {
    int res = Integer.MAX_VALUE;
    TreeNode pre;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traversal(root);
        return res;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        if (pre != null) {
            res = Math.min(res, root.val - pre.val);
        }
        pre = root;
        traversal(root.right);
    }
}

