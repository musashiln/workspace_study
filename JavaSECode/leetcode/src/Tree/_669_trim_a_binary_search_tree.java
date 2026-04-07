package Tree;

import java.util.List;

/**
 * ClassName: _669_trim_a_binary_search_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/23 10:37
 * @Version 1.0
 */
public class _669_trim_a_binary_search_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {3,0,4,null,2,null,null,1};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution26 solution = new Solution26();
        TreeNode root = solution.trimBST(root1, 1, 3);
        BinaryTreeBuilder.printTree(root);
    }
}

class Solution26 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) {
            TreeNode right = trimBST(root.right, low, high);
            return right;
        }
        if (root.val > high) {
            TreeNode left = trimBST(root.left, low, high);
            return left;
        }
        /**
         * 如果能再上面不返回，能执行到这里，说明当前根节点是在区间内的，肯定最后要返这层的根节点
         * 并且继续向下递归，接收下层递归的修剪后的结果
         */
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
