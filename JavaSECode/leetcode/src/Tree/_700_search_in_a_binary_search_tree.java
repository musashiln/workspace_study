package Tree;

import java.util.List;

/**
 * ClassName: _700_search_in_a_binary_search_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/21 15:22
 * @Version 1.0
 */
public class _700_search_in_a_binary_search_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {4,2,7,1,3};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution18 solution = new Solution18();
        TreeNode root = solution.searchBST(root1, 2);
        BinaryTreeBuilder.printTree(root);
    }
}

class Solution18 {
    /**
     * µÝ¹é
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        TreeNode node = null;

        if (val < root.val) {
            node = searchBST(root.left, val);
        }
        if (val > root.val) {
            node = searchBST(root.right, val);
        }
        return node;
    }

    /**
     * µü´ú·¨
     */
    public TreeNode searchBST1(TreeNode root, int val) {
        while (root != null) {
            if (val < root.val) {
                root = root.left;
            } else if (val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}
