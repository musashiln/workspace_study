package Greed;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: _435_non_overlapping_intervals
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/15 23:48
 * @Version 1.0
 */
public class _435_non_overlapping_intervals {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        System.out.println(solution12.eraseOverlapIntervals(intervals));
    }
}

class Solution12 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[i - 1][1]) {
                count++;
            } else {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
            }
        }
        return intervals.length - count;
    }
}
