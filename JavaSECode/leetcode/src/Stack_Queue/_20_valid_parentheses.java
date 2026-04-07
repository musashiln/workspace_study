package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName: _20_valid_parentheses
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/8 11:24
 * @Version 1.0
 */
public class _20_valid_parentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("([)]"));

    }
}

/**
 * 每遇到一个左括号，把与之匹配的右括号入栈
 * 栈顶元素是当前该匹配的括号
 * 3种不匹配的情况
 * 1. (){}[](  有多余的左括号，遍历字符串完成后栈内不为空
 * 2. {[(]]}   有不能匹配的右括号，栈顶元素不匹配
 * 3. (){})))) 有多余的右括号，字符串中有剩余元素时，栈中为空
 */
class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<Character>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                deque.push(')');
            } else if (c == '[') {
                deque.push(']');
            } else if (c == '{') {
                deque.push('}');
            } else if (deque.isEmpty() || deque.peek() != c) {
                return false;
            } else {
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
