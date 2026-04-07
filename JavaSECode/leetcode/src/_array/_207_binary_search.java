package _array;

/**
 * ClassName: _207_binary_search
 * Package: _array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/12 10:45
 * @Version 1.0
 */

/**
 * 最后一定会达到left==right的状态，如果没查找到会有left+1或right-1，
 * 所以找不到一定会退出
 *
 * mid = (right - left) / 2 + left;
 * right+left可能会溢出
 *
 * left <= right
 * 只有1个元素时，[1,1]，包含在合法搜索范围里
 *
 * if (nums[mid] > target)
 * right = mid - 1;
 * mid不在搜索范围中
 */
public class _207_binary_search {
    //左闭右闭
    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }   //增加判断
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;  //除2改为右移
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public int search1(int[] nums,int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

class searchTest {
    public static void main(String[] args) {
        //int[] nums = new int[]{-1,0,3,5,9,12};
        _207_binary_search search1 = new _207_binary_search();
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search1.search(nums, 9));
        System.out.println(search1.search(nums, 2));
        System.out.println(search1.search1(nums, 9));
        System.out.println(search1.search1(nums, 2));
    }
}