package _array;

/**
 * ClassName: _209_minimum_size_subarray_sum
 * Package: _array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/12 18:01
 * @Version 1.0
 */
public class _209_minimum_size_subarray_sum {

    /**
     * 滑动窗口法：
     * 用一次循环解决，即终止位置不会回退
     * 保证终止位置不回退：每一个终止位置都有相对最靠右的位置保证数组和大于target，
     * 称为该终止位置对应的起始位置。
     * 找到起始位置，如果最小长度能够更新，则记录该终止位置的最小长度j-i+1，
     * 当继续减去起始位置后，不满足相加大于target条件，则跳出内层while，
     * 外层循环到下一个终止位置。
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * 时间复杂度分析：
     * 每个元素都是从窗口一进一出，实际上是2*n
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, i = 0;
        int minSubLen = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                minSubLen = Math.min(minSubLen, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }
        return minSubLen == Integer.MAX_VALUE ? 0 : minSubLen;
    }

    /**
     * 暴力：
     * 2层循环，第一层循环依次从数组中元素遍历，
     * 第二层循环将该元素出发的子串长度相加，当超过目标长度时停止，记录长度，
     * 如果小于当前的最小长度，则更新最小长度，否则不变，
     * 直到循环结束。
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen1(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0, count = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                count++;    //可以不用count计数，长度就是(j - i + 1)
                if(sum >= target) {
                    minLength = count < minLength ? count : minLength;
                    break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

class minSubArrayLenTest {
    public static void main(String[] args) {
        _209_minimum_size_subarray_sum minimumSizeSubarraySum = new _209_minimum_size_subarray_sum();
        int[] nums1 = {2,3,1,2,4,3};
        System.out.println(minimumSizeSubarraySum.minSubArrayLen1(7,nums1));

        int[] nums = {2,3,1,2,4,3};
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(7,nums));
    }
}
