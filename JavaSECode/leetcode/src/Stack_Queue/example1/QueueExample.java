package Stack_Queue.example1;

/**
 * ClassName: QueueExample
 * Package: Stack_Queue
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 21:18
 * @Version 1.0
 */
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {

        //LinkedList实现
        Queue<Integer> queue = new LinkedList<>();

        // 入队
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // 出队
        System.out.println(queue.poll()); // 1
        System.out.println(queue.poll()); // 2

        // 查看队首元素
        System.out.println(queue.peek()); // 3

        // 判断队列是否为空
        System.out.println(queue.isEmpty()); // false

        //ArrayDeque实现
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        queue.offer(1);

        //PriorityQueue实现（优先队列）
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        // 出队顺序：1, 2, 3（默认最小堆）


        // 线程安全的队列
        Queue<Integer> concurrentQueue = new ConcurrentLinkedQueue<>();
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();




    }
}