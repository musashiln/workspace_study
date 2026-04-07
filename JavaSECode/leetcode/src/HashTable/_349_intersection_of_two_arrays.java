package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: _349_intersection_of_two_arrays
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/22 21:20
 * @Version 1.0
 */
public class _349_intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Solution1 solution1 = new Solution1();
        int[] res = solution1.intersection1(nums1, nums2);
        for(int i: res) {
            System.out.println(i);
        }
    }
}

class Solution1 {

    /**
     * 使用hashset，先将nums1中元素加入hashset，再遍历nums2从set中比对，
     * 包含的就加入结果集的set中
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if(set.contains(i)) {
                result.add(i);
            }
        }
        //return result.stream().mapToInt(Integer::intValue).toArray();
        int[] res = new int[result.size()];
        int j = 0;
        for (int i: result) {
            res[j++] = i;
        }
        return res;
    }

    /**
     * 将两个数组中的元素分别加入各自的哈希表(因为规定了1000个，数量有限，所以可以使用数组)，
     * 遍历2个数组，如果同一位置>0，则将该元素加入hashset
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection1(int[] nums1, int[] nums2) {
        int[] n1 = new int[1002];
        int[] n2 = new int[1002];
        for (int i : nums1) {
            n1[i]++;
        }
        for (int i : nums2) {
            n2[i]++;
        }
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < n1.length; i++) {
            if(n1[i] > 0 && n2[i] > 0) {
                res.add(i);
            }
        }
        int[] ints = new int[res.size()];
        int i = 0;
        for (int anInt : res) {
            ints[i++] = anInt;
        }
        return ints;
    }
}
