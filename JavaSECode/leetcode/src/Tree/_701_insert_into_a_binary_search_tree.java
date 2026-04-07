package Tree;

import java.util.List;

/**
 * ClassName: _701_insert_into_a_binary_search_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/23 8:18
 * @Version 1.0
 */
public class _701_insert_into_a_binary_search_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {4,2,7,1,3};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution24 solution = new Solution24();
        TreeNode root = solution.insertIntoBST(root1, 5);
        BinaryTreeBuilder.printTree(root);
    }
}

/**
 * 返回的是新构建出的二叉搜索树的根节点
 */
class Solution24 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}