package Tree;

/**
 * ClassName: BinaryTreeBuilder
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/18 9:47
 * @Version 1.0
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBuilder {

    // 根据层序遍历序列构建二叉树
    public static TreeNode buildTree(Integer[] nums) {
        if (nums == null || nums.length == 0 || nums[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1; // 从第二个元素开始
        while (i < nums.length) {
            TreeNode current = queue.poll();

            // 构造左子节点
            if (i < nums.length && nums[i] != null) {
                current.left = new TreeNode(nums[i]);
                queue.offer(current.left);
            }
            i++;

            // 构造右子节点
            if (i < nums.length && nums[i] != null) {
                current.right = new TreeNode(nums[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    // 打印二叉树的辅助方法（层次遍历）
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuilder result = new StringBuilder("[");

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                result.append("null, ");
            } else {
                result.append(node.val).append(", ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }

        // 移除最后的逗号和空格
        result.setLength(result.length() - 2);
        result.append("]");
        System.out.println(result.toString());
    }

    public static TreeNode findNodeByValue(TreeNode root, int value) {
        if (root == null) {
            return null;
        }

        // 如果当前节点值匹配，返回当前节点
        if (root.val == value) {
            return root;
        }

        // 在左子树中查找
        TreeNode leftResult = findNodeByValue(root.left, value);
        if (leftResult != null) {
            return leftResult;
        }

        // 在右子树中查找
        return findNodeByValue(root.right, value);
    }

    public static void main(String[] args) {
        // 示例1: [1,2,3,null,null,4,5]
        Integer[] nums1 = {1, 2, 3, null, null, 4, 5};
        TreeNode root1 = buildTree(nums1);
        printTree(root1);

        // 示例2: [5,4,8,11,null,13,4,7,2,null,null,null,1]
        Integer[] nums2 = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root2 = buildTree(nums2);
        printTree(root2);

        // 示例3: 空树
        Integer[] nums3 = {};
        TreeNode root3 = buildTree(nums3);
        printTree(root3);
    }
}
