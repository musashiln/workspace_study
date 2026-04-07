package _array;

import java.util.Arrays;

/**
 * ClassName: _977_squares_of_a_sorted_array
 * Package: _array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/12 17:04
 * @Version 1.0
 */


public class _977_squares_of_a_sorted_array {

    /**
     * 双指针法，分别从两边扫描，如果left/right指向的平方更大，
     * 则新数组选当前取值(从后往前赋值)，left++/right--，
     * 直到left==right，即到达最后一个元素，这时仍然要处理，所以while条件有等于，
     * 最后一个元素加入后结束。
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int index = nums.length - 1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index--] =nums[left] * nums[left];
                left++;
            } else {
                result[index--] =nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

class sortedSquaresTest {
    public static void main(String[] args) {
        _977_squares_of_a_sorted_array squaresOfASortedArray = new _977_squares_of_a_sorted_array();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] res = squaresOfASortedArray.sortedSquares(nums);
        for (int re : res) {
            System.out.println(re);
        }

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] res1 = squaresOfASortedArray.sortedSquares1(nums1);
        for (int re : res1) {
            System.out.println(re);
        }
    }
}
