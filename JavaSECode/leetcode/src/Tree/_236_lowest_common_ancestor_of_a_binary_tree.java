package Tree;

/**
 * ClassName: _236_lowest_common_ancestor_of_a_binary_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/22 11:20
 * @Version 1.0
 */
public class _236_lowest_common_ancestor_of_a_binary_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution22 solution = new Solution22();
        TreeNode p = BinaryTreeBuilder.findNodeByValue(root1, 5);
        TreeNode q = BinaryTreeBuilder.findNodeByValue(root1, 1);
        System.out.println(solution.lowestCommonAncestor(root1,p,q).val);
    }
}

/**
 * 其中p是q祖先的情况，也已经包含了
 * p没有遍历到q，就已经在终止判断处直接返回了该节点，那么在上一层的return root.left;或return root.right;中会继续将p节点返回到root节点
 */
class Solution22 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        root.left = lowestCommonAncestor(root.left, p , q);
        root.right = lowestCommonAncestor(root.right, p, q);
        if (root.left != null && root.right != null) {
            return root;
        } else if (root.left != null && root.right == null){
            return root.left;
        } else if (root.left == null && root.right != null) {
            return root.right;
        } else {
            return null;
        }
    }
}