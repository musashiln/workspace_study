package Greed;

/**
 * ClassName: _45_jump_game_ii
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/12 20:48
 * @Version 1.0
 */
public class _45_jump_game_ii {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int nums[] = {2,3,1,1,4};
        System.out.println(solution5.jump(nums));
    }
}

/**
 * 局部最优是每步都走最大的
 *
 * 记录可覆盖范围内下一步的最大可达范围
 * 如果这次的可覆盖范围走到头了，发现没有到终点，就向前走一步(res++)，然后更新当前可覆盖范围为下一步的最大可达范围
 * （注意这里跳跃到的其实不是当前可达范围的最远处，而是走到了当前位置的有最大可达范围的下一步的位置）
 */
class Solution5 {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int cur = 0;
        int next = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            next = Math.max(nums[i] + i, next);
            //走到当前覆盖的最大区域时，更新下一步可达的最大区域
            if (next >= nums.length - 1) {
                res++;
                break;
            }
            //如果下一步没有走到终点，并且当前走当前可覆盖的最远了
            if (i == cur) {
                cur = next;
                res++;
            }
            //两个if不能颠倒
        }
        return res;
    }
}
