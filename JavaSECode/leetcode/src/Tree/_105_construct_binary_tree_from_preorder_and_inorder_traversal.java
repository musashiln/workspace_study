package Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: _105_construct_binary_tree_from_preorder_and_inorder_traversal
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/21 12:02
 * @Version 1.0
 */
public class _105_construct_binary_tree_from_preorder_and_inorder_traversal {
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] preorder = {3,9,20,15,7};
        Solution15 solution = new Solution15();
        TreeNode root = solution.buildTree(inorder, preorder);
        BinaryTreeBuilder.printTree(root);
    }
}

class Solution15 {
    private Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] preorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, 0, inorder.length, preorder, 0, preorder.length);
    }

    public TreeNode build(int[] inorder, int inorderStart, int inorderEnd,
                          int[] preorder, int preorderStart, int preorderEnd) {
        if (inorderStart >= inorderEnd || preorderStart >= preorderEnd) {
            return null;
        }
        int middleIndex = map.get(preorder[preorderStart]);
        TreeNode root = new TreeNode(inorder[middleIndex]);
        int lenOfLeft = middleIndex - inorderStart;

        System.out.println("---------------------");
        System.out.print("leftInorder:");
        for (int i = inorderStart; i < middleIndex; i++) {
            System.out.print(inorder[i] + " ");
        }
        System.out.println();

        System.out.print("rightInorder:");
        for (int i = middleIndex + 1; i < inorderEnd; i++) {
            System.out.print(inorder[i] + " ");
        }
        System.out.println();

        System.out.print("leftpreorder:");
        for (int i = preorderStart + 1; i < preorderStart + 1 + lenOfLeft; i++) {
            System.out.print(preorder[i] + " ");
        }
        System.out.println();

        System.out.print("rightpreorder:");
        for (int i = preorderStart + lenOfLeft + 1; i < preorderEnd; i++) {
            System.out.print(preorder[i] + " ");
        }
        System.out.println();

        root.left = build(inorder, inorderStart, middleIndex, preorder, preorderStart + 1, preorderStart + 1 + lenOfLeft);
        root.right = build(inorder, middleIndex + 1, inorderEnd, preorder, preorderStart + 1 + lenOfLeft, preorderEnd);

        return root;
    }
}


