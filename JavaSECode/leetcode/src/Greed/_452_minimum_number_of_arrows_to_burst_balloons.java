package Greed;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: _452_minimum_number_of_arrows_to_burst_balloons
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/15 22:49
 * @Version 1.0
 */
public class _452_minimum_number_of_arrows_to_burst_balloons {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int[][] points = {{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(solution11.findMinArrowShots(points));
    }
}

/**
 * 时间复杂度 : O(NlogN)  排序需要 O(NlogN) 的复杂度
 * 空间复杂度 : O(logN) java所使用的内置函数用的是快速排序需要 logN 的空间
 */
class Solution11 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                count++;
            } else {
                points[i][1] = Math.min(points[i - 1][1], points[i][1]); //更新重叠气球最小右边界
            }
        }
        return count;
    }
}
