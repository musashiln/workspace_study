package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: _225_implement_stack_using_queues
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/8 10:14
 * @Version 1.0
 */
public class _225_implement_stack_using_queues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // 返回 2
        System.out.println(myStack.pop()); // 返回 2
        System.out.println(myStack.empty()); // 返回 False
    }
}

/**
 * 入栈时保证队列中的前端元素是栈顶的元素，
 * 也就是每次新入队一个元素，都把队列中已有的元素依次挪到后面（重新入队），保证新入队的在最前面，
 * 这样能够直接出队
 */
class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<Integer>();
    }

    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */