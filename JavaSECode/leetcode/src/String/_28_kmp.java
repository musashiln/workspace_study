package String;

/**
 * ClassName: _28_kmp
 * Package: String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/29 16:14
 * @Version 1.0
 */
public class _28_kmp {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.strStr("sadbutsad", "sad"));
        System.out.println(solution4.strStr1("sadbutsad", "sad"));
    }
}

class Solution4 {

    /**
     * 前缀表(不减一)
     * 时间复杂度: O(n + m)
     * 空间复杂度: O(m)
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    public void getNext(int[] next, String s) {
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
    }

    /**
     * 暴力
     * 时间复杂度 O(n * m)
     *      空间 O(n + m)
     */
    public int strStr1(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i < h - n + 1; i++) {
            int a = i;
            int j = 0;
//            for (j = 0; j < n; j++) {
//                if (needle.charAt(j) == haystack.charAt(a)) {
//                    a++;
//                } else {
//                    break;
//                }
//            }
            while (j < n && needle.charAt(j) == haystack.charAt(a)) {
                a++;
                j++;
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }
}
