package Greed;

/**
 * ClassName: _738_monotone_increasing_digits
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/18 19:13
 * @Version 1.0
 */
public class _738_monotone_increasing_digits {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int i = solution16.monotoneIncreasingDigits(332);
        System.out.println(i);
    }
}

/**
 * 676
 *  472
 *    469
 */

class Solution16 {
    public int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int flag = chars.length;
        for (int i = chars.length - 1; i > 0 ; i--) {
            if (chars[i - 1] > chars[i]) {
                flag = i;
                chars[i - 1]--;
            }
        }
        for (int i = flag; i < chars.length; i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}
