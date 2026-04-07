package Stack_Queue.example1;

/**
 * ClassName: MyLinkedQueue
 * Package: Stack_Queue.example1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 22:12
 * @Version 1.0
 */
public class MyLinkedQueue<T> {
    // 链表节点定义
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front; // 队头节点
    private Node<T> rear;  // 队尾节点
    private int size;      // 队列大小

    // 构造函数
    public MyLinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // 入队操作
    public boolean offer(T item) {
        Node<T> newNode = new Node<>(item);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        return true;
    }

    // 出队操作
    public T poll() {
        if (isEmpty()) {
            return null;
        }

        T item = front.data;
        front = front.next;

        // 如果队列为空，更新rear为null
        if (front == null) {
            rear = null;
        }

        size--;
        return item;
    }

    // 查看队头元素
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    // 队列是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 获取队列大小
    public int size() {
        return size;
    }

    // 清空队列
    public void clear() {
        while (!isEmpty()) {
            poll();
        }
    }

    // 打印队列
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue (front -> rear): ");
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 查找元素是否存在
    public boolean contains(T item) {
        Node<T> current = front;
        while (current != null) {
            if (current.data.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
