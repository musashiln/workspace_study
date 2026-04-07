package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _145_binary_tree_postorder_traversal
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/18 10:15
 * @Version 1.0
 */
public class _145_binary_tree_postorder_traversal {
    public static void main(String[] args) {

        Integer[] nums1 = {1,2,3,4,5,null,8,null,null,6,7,9};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution2 solution = new Solution2();
        List<Integer> list = solution.postorderTraversal(root1);
        System.out.println(list);
        list = solution.postorderTraversal1(root1);
        System.out.println(list);
    }
}

class Solution2 {
    /**
     * 递归法
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        postOrder(root,list);
        return list;
    }
    public void postOrder(TreeNode root,List<Integer> list) {
        if(root == null) {
            return;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }

    /**
     * 迭代法
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            //判断是否跳转右子树
            if (cur.right == null || cur.right == pre) {
                list.add(cur.val);
                pre = cur;
                cur = null;    //这时当前节点和子树已经处理完，为了下次不进入左子树，直接跳过while，弹出下一个节点
            } else {
                stack.push(cur);
                cur = cur.right;
            }
        }
        return list;
    }
}
