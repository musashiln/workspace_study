package Backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _131_palindrome_partitioning
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/25 14:14
 * @Version 1.0
 */
public class _131_palindrome_partitioning {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        List<List<String>> list = solution.partition("aab");
        System.out.println(list);
    }
}

/**
 * 和组合问题实际上是相同的，只不过递归的条件根据每次切割的子串判断。
 *
 * 每次切割出的子串，就是start与i的闭区间，
 * 每个for循环的start，都是本层开始切割的第一个字符，i是循环中向后遍历时，当次切割到的字符，
 * 比如本次循环是[a|abc]，i=start已经指向a，则循环中第一次切a[a|a|bc]，i++后i指向b，则循环中第二次切ab[a|ab|c]，
 * 循环中第三次切[a|abc|]，这时i++已经超出s.length，退出本层循环
 *
 * 回溯是要把这次切割的子串弹出。
 */
class Solution5 {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTracking(s, 0, new StringBuilder());
        return res;
    }

    public void backTracking(String s, int startIndex, StringBuilder sb) {
        if (startIndex == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (check(sb)) {
                path.add(sb.toString());
                backTracking(s, i + 1, new StringBuilder());
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean check1(StringBuilder sb) {
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() -1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean check(StringBuilder sb) {
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
