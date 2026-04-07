package Greed;

/**
 * ClassName: _53_maximum_subarray
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/9 22:04
 * @Version 1.0
 */
public class _53_maximum_subarray {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution2.maxSubArray(nums));
    }
}

/**
 * 加上当前数字后，如果连续和是负数，就会让后面的数变小，那就抛弃掉连续和，从下一个数字重新算起；
 * 中间不断记录最大值
 */
class Solution2 {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            sum = Math.max(sum, count);
            if (count < 0) {
                count = 0;
            }
        }
        return sum;
    }
}
