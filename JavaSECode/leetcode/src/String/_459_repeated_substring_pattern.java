package String;

/**
 * ClassName: _459_repeated_substring_pattern
 * Package: String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/29 21:45
 * @Version 1.0
 */
public class _459_repeated_substring_pattern {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.repeatedSubstringPattern("abcabcabcabc"));

    }
}

class Solution5 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] next = new int[n];

        int j = 0;
        next[0] = 0;
        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }

        if (next[n - 1] > 0 && n % (n - next[n - 1]) == 0) {
            return true;
        } else {
            return false;
        }
    }
}