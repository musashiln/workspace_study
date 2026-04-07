package Tree;

import java.util.List;

/**
 * ClassName: _404_sum_of_left_leaves
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/20 14:15
 * @Version 1.0
 */
public class _404_sum_of_left_leaves {
    public static void main(String[] args) {
        Integer[] nums1 = {3,9,20,null,null,15,7};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution11 solution = new Solution11();
        System.out.println(solution.sumOfLeftLeaves(root1));
    }
}

/**
 * 后序遍历
 * 需要收集左右子树的信息返回上一层
 * 本层的左叶子之和=左子树+右子树
 */
class Solution11 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int leftValue = sumOfLeftLeaves(root.left);
        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftValue = root.left.val;
        }
        int rightValue = sumOfLeftLeaves(root.right);
        return leftValue + rightValue;
    }
}

