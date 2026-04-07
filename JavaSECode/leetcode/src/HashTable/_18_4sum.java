package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: _18_4sum
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/28 16:02
 * @Version 1.0
 */
public class _18_4sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,0,-2,2};
        int[] nums1 = {2,2,2,2};
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.forSum(nums1, 8));
    }
}

class Solution7 {
    /**
     * 与三数之和相比多了一层循环，内部循环多了剪枝和去重
     * 注意nums[i]和target可能是负数，仅保证nums[k] > target，可能nums[k]+nums[i]变小，
     * 因此需要保证nums[i]严格非负，二级剪枝中也同理
     * 其他包括去重写法不变
     * 二级剪枝去重都可仿照一级的
     * @param nums
     * @param target
     * @return
     */

    public List<List<Integer>> forSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > target && nums[k] >= 0) {
                return list;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            for (int i = k + 1; i < nums.length; i++) {
                if (nums[k] + nums[i] > target && nums[k] + nums[i] >= 0) {
                    break;  //// 注意是break到上一级for循环，如果直接return result;会有遗漏
                }
                if (i > k + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = nums[k] + nums[i] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        list.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right] - 1) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
