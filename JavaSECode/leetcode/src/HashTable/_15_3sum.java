package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: _15_3sum
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/28 11:48
 * @Version 1.0
 */
public class _15_3sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums1 = {0,0,0};
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.threeSum(nums1));
    }
}

class Solution6 {
    /**
     * 双指针法：
     * 将数组排序，
     * i指向a元素遍历数组，b指向a的后一个元素，c指向数组末尾，
     * 如果此时abc相加大于0，只能c向前移动；如果小于0，只能b向前移动；等于0，加入结果集中
     * a的去重：如果当前与已经遍历过的前一个相同，continue进入下一次循环
     * （注意不是和后一个相比，后一个是b元素，允许a==b，且后一个对a来说是没访问的）
     * b的去重：如果b与当前值相等，则一直向前移动
     * c的去重：如果c与当前值相等，则一直向后移动
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (nums[i] > 0) {
                return list;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {  //注意left<right控制累加下标
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;    //注意别丢
                    left++;
                }
            }
        }
        return list;
    }
}
