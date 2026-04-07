package Stack_Queue.example1;

/**
 * ClassName: MyArrayQueue
 * Package: Stack_Queue.example1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 22:12
 * @Version 1.0
 */
public class MyArrayQueue<T> {
    private T[] array;
    private int front; // 队头指针
    private int rear;  // 队尾指针
    private int size;  // 当前元素数量
    private int capacity; // 队列容量

    // 构造函数
    @SuppressWarnings("unchecked")
    public MyArrayQueue(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // 默认容量构造函数
    public MyArrayQueue() {
        this(10);
    }

    // 入队操作
    public boolean offer(T item) {
        if (isFull()) {
            resize();
        }
        array[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    // 出队操作
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T item = array[front];
        array[front] = null; // 帮助垃圾回收
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // 查看队头元素
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[front];
    }

    // 队列是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 队列是否已满
    public boolean isFull() {
        return size == capacity;
    }

    // 获取队列大小
    public int size() {
        return size;
    }

    // 扩容操作
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = capacity * 2;
        T[] newArray = (T[]) new Object[newCapacity];

        // 复制元素到新数组
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(front + i) % capacity];
        }

        this.array = newArray;
        this.front = 0;
        this.rear = size;
        this.capacity = newCapacity;
    }

    // 打印队列
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue (front -> rear): ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}