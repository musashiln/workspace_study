package Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName: _150_evaluate_reverse_polish_notation
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/8 13:30
 * @Version 1.0
 */
public class _150_evaluate_reverse_polish_notation {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.evalRPN(new String[]{"2","1","+","3","*"}));
    }
}

class Solution2 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<Integer>();
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 - temp1);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
