package Tree;

import java.util.List;

/**
 * ClassName: _98_validate_binary_search_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/22 8:20
 * @Version 1.0
 */
public class _98_validate_binary_search_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {5,1,4,null,null,3,6};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution19 solution = new Solution19();
        System.out.println(solution.isValidBST(root1));
    }
}
class Solution19 {
    TreeNode pre;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left);

        if (pre != null && pre.val >= root.val) {
            return false;
        }
        pre = root;

        boolean right = isValidBST(root.right);
        return left && right;
    }
}

