package Tree;

import java.util.List;

/**
 * ClassName: _617_merge_two_binary_trees
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/21 14:25
 * @Version 1.0
 */
public class _617_merge_two_binary_trees {
    public static void main(String[] args) {
        Integer[] nums1 = {1,3,2,5};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Integer[] nums2 = {2,1,3,null,4,null,7};
        TreeNode root2 = BinaryTreeBuilder.buildTree(nums2);
        Solution17 solution = new Solution17();
        TreeNode root = solution.mergeTrees(root1, root2);
        BinaryTreeBuilder.printTree(root);
    }
}

class Solution17 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
