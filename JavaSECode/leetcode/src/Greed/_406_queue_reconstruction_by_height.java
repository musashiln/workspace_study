package Greed;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * ClassName: _406_queue_reconstruction_by_height
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/14 21:51
 * @Version 1.0
 */
public class _406_queue_reconstruction_by_height {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        Solution10 solution10 = new Solution10();
        System.out.println(Arrays.deepToString(solution10.reconstructQueue(people)));
    }
}

class Solution10 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            else return b[0] - a[0];
        });
        LinkedList<int[]> que = new LinkedList<>();
        for (int[] person : people) {
            que.add(person[1], person);
        }
        return que.toArray(new int[people.length][]);
    }
}
