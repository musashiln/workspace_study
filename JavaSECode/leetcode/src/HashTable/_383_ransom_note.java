package HashTable;

/**
 * ClassName: _383_ransom_note
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/28 9:29
 * @Version 1.0
 */
public class _383_ransom_note {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.conConstruct("a", "b"));
        System.out.println(solution5.conConstruct("aa", "ab"));
        System.out.println(solution5.conConstruct("aa", "aab"));
    }
}

class Solution5 {
    public boolean conConstruct (String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] record = new int[26];
        for (char c : magazine.toCharArray()) {
            record[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            record[c - 'a']--;
        }
        for (int i : record) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }
}
