package Tree;

import java.util.List;

/**
 * ClassName: _450_delete_node_in_a_bst
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/23 9:47
 * @Version 1.0
 */
public class _450_delete_node_in_a_bst {
    public static void main(String[] args) {
        Integer[] nums1 = {5,3,6,2,4,null,7};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution25 solution = new Solution25();
        TreeNode root = solution.deleteNode(root1, 3);
        BinaryTreeBuilder.printTree(root);
    }
}

/**
 * 找到要删除节点后不需要再继续遍历，进行修改后，向上一层返回当前新树的根节点，上一层对应的孩子接住返回值
 * 分为5种情况
 * 找不到删除节点
 * 叶子节点
 * 左子树为空
 * 右子树为空
 * 左右都不为空:右孩子作为新根节点，左孩子放到右子树最左节点的左孩子
 */
class Solution25 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            } else {
                TreeNode cur = root.right;
                while (cur.left != null) {
                    cur = cur.left;
                }
                cur.left = root.left;
                return root.right;
            }
        }
        //上面没有返回，这层不是要删除的节点，接收下一层返回的根节点
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
