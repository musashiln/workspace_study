package Tree;

import java.util.List;

/**
 * ClassName: _108_convert_sorted_array_to_binary_search_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/23 11:29
 * @Version 1.0
 */
public class _108_convert_sorted_array_to_binary_search_tree {
    public static void main(String[] args) {
        int[] nums1 = {-10,-3,0,5,9};
        Solution27 solution = new Solution27();
        TreeNode root = solution.sortedArrayToBST(nums1);
        BinaryTreeBuilder.printTree(root);
    }
}

/**
 * ¹Ì¶¨Çø¼ä£¬×ó±ÕÓÒ±Õ
 */
class Solution27 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build (int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);
        return root;
    }
}
