package Stack_Queue;

/**
 * ClassName: _1047_remove_all_adjacent_duplicates_in_string
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/8 12:13
 * @Version 1.0
 */
public class _1047_remove_all_adjacent_duplicates_in_string {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.removeDuplicates("abbaca"));
    }
}

/**
 * 消除重复项后，还可能出现新的重复项，需要保存之前遍历过的字符作比较，因此使用栈。
 * 用StringBuffer模拟栈，返回时不需要再调整顺序，直接把字符串头部当成栈底，尾部当成栈顶
 */
class Solution1 {
    public String removeDuplicates(String s) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (top < 0 || stack.charAt(top) != s.charAt(i)) {
                stack.append(s.charAt(i));
                top++;
            } else {
                stack.deleteCharAt(top);
                top-- ;
            }
        }
        return stack.toString();
    }
}