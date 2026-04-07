package ex_1._class.object.Copy.Array;

import java.util.Arrays;

/**
 * ClassName: basic
 * Package: ex_1._class.object.Copy.Array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 11:04
 * @Version 1.0
 */
public class basic {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] nums1 = Arrays.copyOf(nums, nums.length);
        System.out.println(nums == nums1);  //false
        nums[0] = 1;
        System.out.println(nums[0] == nums1[0]);  //false

        int[] nums2 = new int[5];
        int[] nums3 = nums2.clone();
        System.out.println(nums2 == nums3);  //false
        nums2[0] = 1;
        System.out.println(nums2[0] == nums3[0]);  //false


    }
}
