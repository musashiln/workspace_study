package Backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _17_letter_combinations_of_a_phone_number
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/24 13:52
 * @Version 1.0
 */
public class _17_letter_combinations_of_a_phone_number {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        List<String> list = solution.letterCombinations("23");
        System.out.println(list);
    }
}

class Solution2 {
    List<String> res = new ArrayList<>();
    String[] numMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        backTracking(digits, numMap, 0);
        return res;
    }

    StringBuilder temp = new StringBuilder();
    public void backTracking(String digits, String[] numMap, int index) {
        if (index == digits.length()) {
            res.add(temp.toString());
            return;
        }
        String letters = numMap[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            temp.append(letters.charAt(i));
            backTracking(digits, numMap, index + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

}

