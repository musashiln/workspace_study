package _array;

/**
 * ClassName: _27_remove_element
 * Package: _array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/12 13:46
 * @Version 1.0
 */
public class _27_remove_element {
    //双指针
    /**
     * 如果快指针指向的数据不为val，则慢指针同步数值且前进；
     * 如果为val，慢指针不做任何操作，不赋值也不移动
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slow = 0,fast = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    //暴力
    //注意循环条件是i<n和j<n
    public int removeElement1(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] == val) {
                for (int j = i + 1; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;  //注意移动到当前位置的数值不能够跳过
                n--;
            }
        }
        return n;
    }
}

class removeElementTest {
    public static void main(String[] args) {
        //int[] nums = new int[]{-1,0,3,5,9,12};
        _27_remove_element remove_element = new _27_remove_element();
        int[] nums1 = {3,2,2,3};
        int[] nums2 = {0,1,2,2,3,0,4,2};

        //System.out.println(remove_element.removeElement(nums1, 3));
        //System.out.println(remove_element.removeElement(nums2, 2));

        System.out.println(remove_element.removeElement1(nums1, 3));
        System.out.println(remove_element.removeElement1(nums2, 2));
    }
}

