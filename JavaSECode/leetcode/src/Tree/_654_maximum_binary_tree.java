package Tree;

/**
 * ClassName: _654_maximum_binary_tree
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/21 13:28
 * @Version 1.0
 */
public class _654_maximum_binary_tree {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        Solution16 solution = new Solution16();
        TreeNode root = solution.constructMaximumBinaryTree(nums);
        BinaryTreeBuilder.printTree(root);
    }
}

class Solution16 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length);
    }

    public TreeNode build(int[] nums, int start, int end) {
        if (end - start < 1) {
            return null;
        }
        if (end - start == 1) {
            return new TreeNode(nums[start]);
        }
        int maxValue = nums[start];
        int maxIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (nums[i] > maxValue) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }

        System.out.println("-----------------------");
        System.out.print("leftNums:");
        for (int i = start; i < maxIndex; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.print("rightNums:");
        for (int i = maxIndex + 1; i < end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        TreeNode root = new TreeNode(maxValue);
        root.left = build(nums, start, maxIndex);
        root.right = build(nums, maxIndex + 1, end);
        return root;
    }
}