package Greed;

/**
 * ClassName: _55_jump_game
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/11 21:50
 * @Version 1.0
 */
public class _55_jump_game {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] nums = {2,3,1,1,4};
        System.out.println(solution4.canJump(nums));
    }
}

class Solution4 {
    public boolean canJump(int[] nums) {
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(i + nums[i], cover);
            if (cover >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
