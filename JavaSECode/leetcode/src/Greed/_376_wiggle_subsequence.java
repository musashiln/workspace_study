package Greed;

/**
 * ClassName: _376_wiggle_subsequence
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/9 21:09
 * @Version 1.0
 */
public class _376_wiggle_subsequence {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        //int[] nums = {1,7,4,9,2,5};
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(solution1.wiggleMaxLength(nums));
    }
}

/**
 * 1.考虑摆动中有平坡（这里代码是永远取平坡的右端，因此左半边有=是左边平坡的情况）
 * 2.只有首尾元素（默认长度是1，循环中只判断到倒数第2个，if条件是满足的）
 * 3.单调中有平坡，如果preDiff = curDiff实时更新，即放在if外面，那么单调平坡也会被计数，
 *   所以是设置成有摆动时才更新，即curDiff=0时是不更新的
 */
class Solution1 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int preDiff = 0;
        int curDiff = 0;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            curDiff = nums[i + 1] - nums[i];
            if ((preDiff >= 0 && curDiff < 0) || (preDiff <= 0 && curDiff > 0)) {
                count++;
                preDiff = curDiff;
            }
        }
        return count;
    }
}
