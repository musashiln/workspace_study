package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: _239_sliding_window_maximum
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/8 16:18
 * @Version 1.0
 */
public class _239_sliding_window_maximum {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = solution3.maxSlidingWindow(nums, 3);
        for (int i : res) {
            System.out.println(i);
        }
    }
}


/**
 * 维护单调队列，队列中存储的是nums的下标，下标递增，
 * 下标对应的值严格递减，使队列的最左端（作为队首）一直是窗口中的最大值，
 * 如何实现这样的队列？
 * 每次遍历到新元素i时（当前窗口为[i - k + 1] ~ [i]），都判断队列的队尾是否小于下标i的元素，
 * 如果小于就一直弹出，直到队中为空或者新元素是队列中最小值，将新元素加入到队尾，
 * 这样队列中保存的下标所对应的值都严格递减，都是可能成为最大值的下标。
 *
 * 实现：
 * 第一个for循环：
 * 先处理第一个窗口，也就是[0]~[k-1]，保证递减，这时还没有滑动操作，
 * 然后给第一个窗口产生的res[0]赋值，
 * 第二个for循环：
 * 处理剩余的窗口：保证递减，滑动操作(用下标判断窗口长度),给res[]赋值
 * 注意每次产生的结果是res[i-k+1]，也就是当前新元素作为队尾的这个窗口的最大值
 *
 * 使用双端队列：
 * 因为队首有弹出操作(滑动)，队尾有弹出(保证递减)和放入操作(保存新元素)
 */
class Solution3 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int[] res = new int[nums.length - k + 1];
        res[0] = nums[deque.peekFirst()];
        for (int i = k; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            res[i - k + 1] = nums[deque.peekFirst()];
        }
        return res;
    }
}
