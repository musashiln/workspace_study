package Stack_Queue.example1;

/**
 * ClassName: StackExample
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 20:44
 * @Version 1.0
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        //stack实现
        Stack<Integer> stack = new Stack<>();

        // 入栈
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 出栈
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2

        // 查看栈顶元素
        System.out.println(stack.peek()); // 1

        // 判断栈是否为空
        System.out.println(stack.isEmpty()); // false


        //deque实现
        Deque<Integer> stack1 = new ArrayDeque<>();

        // 入栈
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        // 出栈
        System.out.println(stack1.pop()); // 3
        System.out.println(stack1.pop()); // 2

        // 查看栈顶元素
        System.out.println(stack1.peek()); // 1

        // 判断栈是否为空
        System.out.println(stack1.isEmpty()); // false
    }
}
