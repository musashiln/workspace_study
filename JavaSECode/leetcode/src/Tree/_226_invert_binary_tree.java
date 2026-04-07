package Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _226_invert_binary_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/19 10:15
 * @Version 1.0
 */
public class _226_invert_binary_tree {
    public static void main(String[] args) {
        Integer[] nums1 = {4,2,7,1,3,6,9};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution4 solution = new Solution4();
        TreeNode node = solution.invertTree1(root1);
        BinaryTreeBuilder.printTree(node);
    }
}
class Solution4 {
    //后序，递归法
    //从下向上翻转
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.left);   //左
        TreeNode right = invertTree(root.right);  //右
        root.left = right;  //中 (swap)
        root.right = left;
        return root;
    }

    //先序，递归法
    //从上到下翻转
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;  //中 (swap)
        root.right = tmp;
        TreeNode left = invertTree1(root.left);   //左
        TreeNode right = invertTree1(root.right);  //右

        return root;
    }

    //先序，迭代法
    public TreeNode invertTree2(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null) {
            // 1. 先访问当前节点，然后一路向左
            while(cur != null) {
                TreeNode temp = cur.left;
                cur.left = cur.right;
                cur.right = temp;
                stack.push(cur);
                cur = cur.left;
            }
            // 2. 左子树已遍历完，回溯到父节点
            cur = stack.pop();
            cur = cur.right;
        }

        return root;
    }
}

