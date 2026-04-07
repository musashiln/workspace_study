package String;

import static java.lang.Math.min;

/**
 * ClassName: _541_reverse_string_ii
 * Package: String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/28 19:21
 * @Version 1.0
 */
public class _541_reverse_string_ii {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.reverseStr("abcdefg", 2));
        System.out.println(solution1.reverseStr1("abcdefg", 2));
    }
}

class Solution1 {
    /**
     * 每次循环都走2k，判断当前的区间内是否大于等于k
     * 大于等于k，则反转k个；
     * 小于k，则反转i到length-1的剩下全部
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i;
            int end = min(s.length() - 1, i + k - 1);
            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }

    public String reverseStr1(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            if (i + k - 1 <= s.length() - 1) {
                reverse(chars, i , i + k - 1);
            } else {
                reverse(chars, i ,s.length() - 1);
            }
        }
        return new String(chars);
    }

    /**
     * 自定义反转，左闭右闭
     * @param chars
     * @param startIndex
     * @param endIndex
     */
    public void reverse (char[] chars, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char temp = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
