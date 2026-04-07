package Stack_Queue.example1;

import com.sun.jmx.remote.internal.ArrayQueue;

/**
 * ClassName: QueueTest
 * Package: Stack_Queue.example1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 22:13
 * @Version 1.0
 */
public class QueueTest {
    public static void main(String[] args) {
        System.out.println("=== 数组队列测试 ===");
        testArrayQueue();

        System.out.println("\n=== 链表队列测试 ===");
        testLinkedQueue();
    }

    private static void testArrayQueue() {
        MyArrayQueue<Integer> queue = new MyArrayQueue<>(3);

        // 入队测试
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4); // 触发扩容
        queue.printQueue();

        // 查看队头
        System.out.println("队头元素: " + queue.peek());

        // 出队测试
        System.out.println("出队: " + queue.poll());
        System.out.println("出队: " + queue.poll());
        queue.printQueue();

        // 再次入队
        queue.offer(5);
        queue.offer(6);
        queue.printQueue();
    }

    private static void testLinkedQueue() {
        MyLinkedQueue<String> queue = new MyLinkedQueue<>();

        // 入队测试
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.printQueue();

        // 查看队头
        System.out.println("队头元素: " + queue.peek());

        // 出队测试
        System.out.println("出队: " + queue.poll());
        System.out.println("出队: " + queue.poll());
        queue.printQueue();

        // 再次入队
        queue.offer("D");
        queue.offer("E");
        queue.printQueue();

        // 查找元素
        System.out.println("包含 'D': " + queue.contains("D"));
        System.out.println("包含 'A': " + queue.contains("A"));
    }
}