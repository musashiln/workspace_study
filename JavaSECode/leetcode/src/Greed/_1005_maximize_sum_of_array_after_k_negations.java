package Greed;

import java.util.Arrays;

/**
 * ClassName: _1005_maximize_sum_of_array_after_k_negations
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/13 22:03
 * @Version 1.0
 */
public class _1005_maximize_sum_of_array_after_k_negations {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[] nums = {2,-3,-1,5,-4};
        System.out.println(solution6.largestSumAfterKNegations(nums,2));
    }
}

class Solution6 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = nums[i] * (-1);
                k--;
            }
        }
        if (k % 2 == 1) {
            Arrays.sort(nums);
            nums[0] = nums[0] * (-1);
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
