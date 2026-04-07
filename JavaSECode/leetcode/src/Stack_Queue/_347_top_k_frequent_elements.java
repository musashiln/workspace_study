package Stack_Queue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * ClassName: _347_top_k_frequent_elements
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/17 21:37
 * @Version 1.0
 */
public class _347_top_k_frequent_elements {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] nums = solution5.topKFrequent(new int[]{1, 2, 1, 2, 1, 2, 3, 1, 3, 2}, 2);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

/**
 * 小顶堆，
 * 维持k个值，每次弹出最小的值，这样剩下的k个是最大的
 * 定义优先队列按照频率升序（小顶堆实现）
 * 先遍历数组加入到map中，统计出每个数字的频率，
 * 再遍历map加入队列，如果超过k个弹出，
 * 最后队列依次弹出加入数组返回结果
 */
class Solution5 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>((o1, o2) -> o1[1] - o2[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int[] temp = new int[2];
            temp[0] = entry.getKey();
            temp[1] = entry.getValue();
            priorityQueue.offer(temp);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = priorityQueue.poll()[0];
        }
        return res;
    }
}