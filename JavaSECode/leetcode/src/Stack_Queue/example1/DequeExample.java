package Stack_Queue.example1;

/**
 * ClassName: DequeExample
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 21:22
 * @Version 1.0
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 作为队列使用（FIFO）
        deque.offerLast(1); // 队尾入队
        deque.offerLast(2);
        System.out.println(deque.pollFirst()); // 队首出队，输出1

        // 作为栈使用（LIFO）
        deque.push(3); // 等同于addFirst，入栈
        deque.push(4);
        System.out.println(deque.pop()); // 等同于removeFirst，出栈，输出4
        System.out.println(deque.pop());
        System.out.println(deque.pop());


        // 栈操作
        deque.push(1);      // 入栈
        deque.pop();        // 出栈

// 队列操作
        deque.offer(1);     // 入队
        deque.poll();       // 出队

// 双端操作
        deque.offerFirst(1); // 头部添加
        deque.offerLast(2);  // 尾部添加
        deque.pollFirst();   // 头部移除
        deque.pollLast();    // 尾部移除
    }
}
