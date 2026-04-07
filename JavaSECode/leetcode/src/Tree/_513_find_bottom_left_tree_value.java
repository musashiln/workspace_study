package Tree;

import java.util.List;

/**
 * ClassName: _513_find_bottom_left_tree_value
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/20 15:02
 * @Version 1.0
 */
public class _513_find_bottom_left_tree_value {
    public static void main(String[] args) {
        Integer[] nums1 = {1,2,3,4,null,5,6,null,null,7};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution12 solution = new Solution12();
        System.out.println(solution.findBottomLeftValue(root1));
    }
}

/**
 * 没有中间节点的处理逻辑，只需要保证左右顺序
 */
class Solution12 {
    private int Depth = -1;
    private int res = 0;
    public int findBottomLeftValue(TreeNode root) {
        traversal(root, 0);
        return res;
    }

    public void traversal(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (depth > Depth) {
                res = root.val;
                Depth = depth;
            }
        }
        if (root.left != null) {  //可以简化成traversal(root.left, depth++);
            depth++;
            traversal(root.left, depth);
            depth--;   //回溯，为了恢复depth和下一个分支继续比较
        }
        if (root.right != null) {
            depth++;
            traversal(root.right, depth);
            depth--;
        }
    }
}

