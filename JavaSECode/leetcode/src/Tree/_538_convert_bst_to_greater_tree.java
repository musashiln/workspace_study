package Tree;

import java.util.List;

/**
 * ClassName: _538_convert_bst_to_greater_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/23 11:57
 * @Version 1.0
 */
public class _538_convert_bst_to_greater_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution28 solution = new Solution28();
        TreeNode root = solution.convertBST(root1);
        BinaryTreeBuilder.printTree(root);
    }
}

class Solution28 {
    int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        traversal(root);
        return root;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.right);
        sum += root.val;
        root.val = sum;
        traversal(root.left);
    }
}
