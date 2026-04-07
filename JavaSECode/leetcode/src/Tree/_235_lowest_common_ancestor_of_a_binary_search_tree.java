package Tree;

/**
 * ClassName: _235_lowest_common_ancestor_of_a_binary_search_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/22 12:29
 * @Version 1.0
 */
public class _235_lowest_common_ancestor_of_a_binary_search_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution23 solution = new Solution23();
        TreeNode p = BinaryTreeBuilder.findNodeByValue(root1, 2);
        TreeNode q = BinaryTreeBuilder.findNodeByValue(root1, 8);
        System.out.println(solution.lowestCommonAncestor(root1,p,q).val);
    }
}

class Solution23 {
    /**
     * 递归，实际上不是前中后序遍历，而是只有向左右的递归，从上往下搜索
     * 返回时走的路径也是，只有左右
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val > p.val && root.val > q.val) {
            TreeNode left = lowestCommonAncestor(root.left, p , q);
            if (left != null) {
                return left;
            }
        }
        if (root.val < p.val && root.val < q.val) {
            TreeNode right = lowestCommonAncestor(root.right, p , q);
            if (right != null) {
                return right;
            }
        }
        return root;
    }

    /**
     * 迭代法
     */
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
