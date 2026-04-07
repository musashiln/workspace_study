package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: _102_binary_tree_level_order_traversal
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/19 8:53
 * @Version 1.0
 */
public class _102_binary_tree_level_order_traversal {
    public static void main(String[] args) {
        Integer[] nums = {3,9,20,null,null,15,7};
        TreeNode node = BinaryTreeBuilder.buildTree(nums);
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.levelOrder(node));
    }
}

class Solution3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}