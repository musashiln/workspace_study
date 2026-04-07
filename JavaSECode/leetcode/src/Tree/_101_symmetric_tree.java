package Tree;

import java.util.List;

/**
 * ClassName: _101_symmetric_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/19 12:08
 * @Version 1.0
 */
public class _101_symmetric_tree {
    public static void main(String[] args) {
        //Integer[] nums1 = {1,2,2,3,4,4,3};
        Integer[] nums1 = {1,2,2,null,3,null,3};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution5 solution = new Solution5();
        System.out.println(solution.isSymmetric(root1));
    }
}


/**
 * 递归，父节点要获得左右子树的比较结果信息，内外层都比较过后才能返回上一层
 */
class Solution5 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        }
        if (right == null && left != null) {
            return false;
        }
        if (right == null && left == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right, right.left);
        return outside && inside;
    }
}
