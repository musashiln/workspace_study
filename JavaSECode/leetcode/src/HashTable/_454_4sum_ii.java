package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: _454_4sum_ii
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/23 21:19
 * @Version 1.0
 */
public class _454_4sum_ii {
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {-2,-1}, nums3 = {-1,2}, nums4 = {0,2};
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.fourSumCount(nums1, nums2, nums3, nums4));
    }
}

class Solution4 {
    public int fourSumCount(int[] nums1, int[] nums2,int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int balance = -(nums3[i] + nums4[j]);
                res += map.getOrDefault(balance, 0);
            }
        }
        return res;
    }
}
