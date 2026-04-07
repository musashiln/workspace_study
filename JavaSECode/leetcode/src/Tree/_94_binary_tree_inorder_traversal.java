package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _94_binary_tree_inorder_traversal
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/18 9:59
 * @Version 1.0
 */
public class _94_binary_tree_inorder_traversal {
    public static void main(String[] args) {

        //Integer[] nums1 = {1,2,3,4,5,null,8,null,null,6,7,9};
        Integer[] nums1 = {1,2,3};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution1 solution = new Solution1();
        List<Integer> list = solution.inorderTraversal(root1);
        System.out.println(list);
    }
}

class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root ,list);
        return list;
    }

    public void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }
}