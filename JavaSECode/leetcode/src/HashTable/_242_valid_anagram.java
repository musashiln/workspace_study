package HashTable;

/**
 * ClassName: _242_valid_anagram
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/22 17:42
 * @Version 1.0
 */
public class _242_valid_anagram {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}

class Solution {
    /**
     * 时间复杂度O(n+m)
     * 空间复杂度O(1)
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }
        for (int count : record) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
