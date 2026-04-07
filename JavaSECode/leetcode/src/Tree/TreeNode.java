package Tree;

/**
 * ClassName: TreeNode
 * Package: Tree
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/17 23:03
 * @Version 1.0
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
