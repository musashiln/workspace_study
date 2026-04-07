package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _144_binary_tree_preorder_traversal
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/18 9:28
 * @Version 1.0
 */
public class _144_binary_tree_preorder_traversal {
    public static void main(String[] args) {

        Integer[] nums1 = {1,2,3,4,5,null,8,null,null,6,7,9};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution solution = new Solution();
        List<Integer> list = solution.preorderTraversal(root1);
        System.out.println(list);
    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root ,list);
        return list;
    }

    public void preOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null) {
            // 1. 先访问当前节点，然后一路向左
            while(cur != null) {
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            // 2. 左子树已遍历完，回溯到父节点
            cur = stack.pop();
            cur = cur.right;
        }

        return list;
    }
}
