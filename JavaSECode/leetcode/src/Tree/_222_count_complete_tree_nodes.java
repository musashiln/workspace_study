package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _222_count_complete_tree_nodes
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/20 9:32
 * @Version 1.0
 */
public class _222_count_complete_tree_nodes {
    public static void main(String[] args) {
        Integer[] nums1 = {1,2,3,4,5,6};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution8 solution = new Solution8();
        System.out.println(solution.countNodes(root1));
    }
}

class Solution8 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = 0, rightDepth = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        while (left != null) {
            leftDepth++;
            left = left.left;
        }
        while (right != null) {
            rightDepth++;
            right = right.right;
        }
        if (leftDepth == rightDepth) {
            return (2 << leftDepth) - 1;
        }
        int leftNums = countNodes(root.left);
        int rightNums = countNodes(root.right);
        return leftNums + rightNums + 1;
    }


}


