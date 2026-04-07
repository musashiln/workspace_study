package String;

/**
 * ClassName: _344_reverse_string
 * Package: String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/28 18:19
 * @Version 1.0
 */
public class _344_reverse_string {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        Solution solution = new Solution();
        solution.reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }

    }
}

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
