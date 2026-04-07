package Greed;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: _56_merge_intervals
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/18 13:17
 * @Version 1.0
 */
public class _56_merge_intervals {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = solution15.merge(intervals);
        List<List<Integer>> list = Arrays.stream(merge)       // Stream<int[]>
                .map(row -> Arrays.stream(row)                // 对每一行创建 IntStream
                        .boxed()                               // 装箱为 Stream<Integer>
                        .collect(Collectors.toList()))        // 收集为 List<Integer>
                .collect(Collectors.toList());                 // 收集外层 List<List<Integer>>

        System.out.println(list);
    }
}

class Solution15 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (right >= intervals[i][0]) {
                right = Math.max(right, intervals[i][1]);
            } else {
                res.add(new int[]{start, right});
                start = intervals[i][0];
                right = intervals[i][1];
            }
        }
        res.add(new int[]{start, right});
        return res.toArray(new int[res.size()][]);
    }
}
