package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: _1_two_sum
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/23 18:55
 * @Version 1.0
 */
public class _1_two_sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Solution3 solution3 = new Solution3();
        int[] ints = solution3.twoSum(nums, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution3 {
    public int[] twoSum (int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                res[0] = map.get(temp);
                res[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }

}
