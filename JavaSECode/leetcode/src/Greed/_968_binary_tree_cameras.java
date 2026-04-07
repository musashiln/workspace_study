package Greed;

import Tree.BinaryTreeBuilder;
import Tree.TreeNode;

/**
 * ClassName: _968_binary_tree_cameras
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/18 21:51
 * @Version 1.0
 */
public class _968_binary_tree_cameras {
    public static void main(String[] args) {
        Integer[] nums1 = {0,0,null,0,0};
        TreeNode root1 = BinaryTreeBuilder.buildTree(nums1);
        Solution17 solution17 = new Solution17();
        System.out.println(solution17.minCameraCover(root1));
    }
}

/**
 * 0:表示无覆盖
 * 1:表示放摄像头
 * 2:表示有覆盖
 *
 *     后序遍历，根据左右节点的情况,来判读 自己的状态
 */
class Solution17 {
    int result = 0;
    public int minCameraCover(TreeNode root) {
        // 对根节点的状态做检验,防止根节点是无覆盖状态 .
        if (traversal(root) == 0) {
            result++;
        }
        return result;
    }
    public int traversal(TreeNode cur) {
        if (cur == null) {
            // 空节点默认为 有覆盖状态，避免在叶子节点上放摄像头
            return 2;
        }
        int left = traversal(cur.left);
        int right = traversal(cur.right);

        // 如果左右节点都覆盖了的话, 那么本节点的状态就应该是无覆盖,没有摄像头
        if (left == 2 && right == 2) {
            return 0;
        }
        if (left == 0 || right == 0) {
            // 左右节点都是无覆盖状态,那 根节点此时应该放一个摄像头
            result++;
            return 1;
        }
        if (left == 1 || right == 1) {
            // 左右节点的 状态为 (1,1) (1,2) (2,1) 也就是左右节点至少存在 1个摄像头
            return 2;
        }
        return -1;
    }
}
