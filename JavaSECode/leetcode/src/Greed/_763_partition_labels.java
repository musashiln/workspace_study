package Greed;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _763_partition_labels
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/18 10:16
 * @Version 1.0
 */
public class _763_partition_labels {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        String s = "ababcbacadefegdehijhklij";
        List<Integer> list = solution13.partitionLabels(s);
        System.out.println(list);
    }
}

class Solution13 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        char[] chars = s.toCharArray();
        int[] edge = new int[26];
        for (int i = 0; i < chars.length; i++) {
            edge[chars[i] - 'a'] = i;
        }
        int idx = 0;
        int last = -1;
        for (int i = 0; i < chars.length; i++) {
            idx = Math.max(edge[chars[i] - 'a'], idx);
            if (i == idx) {
                res.add(i - last);
                last = i;
            }
        }
        return res;
    }
}
