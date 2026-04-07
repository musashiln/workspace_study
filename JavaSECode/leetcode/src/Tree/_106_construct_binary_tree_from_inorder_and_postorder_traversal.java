package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: _106_construct_binary_tree_from_inorder_and_postorder_traversal
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/21 11:24
 * @Version 1.0
 */
public class _106_construct_binary_tree_from_inorder_and_postorder_traversal {
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        Solution14 solution = new Solution14();
        TreeNode root = solution.buildTree(inorder, postorder);
        BinaryTreeBuilder.printTree(root);
    }
}

class Solution14 {
    private Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode build(int[] inorder, int inorderStart, int inorderEnd,
                          int[] postorder, int postorderStart, int postorderEnd) {
        if (inorderStart >= inorderEnd || postorderStart >= postorderEnd) {
            return null;
        }
        int middleIndex = map.get(postorder[postorderEnd - 1]);
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

        System.out.print("leftPostorder:");
        for (int i = postorderStart; i < postorderStart + lenOfLeft; i++) {
            System.out.print(postorder[i] + " ");
        }
        System.out.println();

        System.out.print("rightPostorder:");
        for (int i = postorderStart + lenOfLeft; i < postorderEnd - 1; i++) {
            System.out.print(postorder[i] + " ");
        }
        System.out.println();

        root.left = build(inorder, inorderStart, middleIndex, postorder, postorderStart, postorderStart + lenOfLeft);
        root.right = build(inorder, middleIndex + 1, inorderEnd, postorder, postorderStart + lenOfLeft, postorderEnd - 1);
        
        return root;
    }
}