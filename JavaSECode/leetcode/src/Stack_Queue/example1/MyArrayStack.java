package Stack_Queue.example1;

/**
 * ClassName: MyArrayStack
 * Package: Stack_Queue.example1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 21:50
 * @Version 1.0
 */


/**
 * 数组实现栈
 * @param <E> 栈元素类型
 */
public class MyArrayStack<E> {
    private Object[] elements;  // 存储元素的数组
    private int top;            // 栈顶指针
    private int capacity;       // 栈容量

    /**
     * 默认构造方法，初始容量为10
     */
    public MyArrayStack() {
        this(10);
    }

    /**
     * 指定容量的构造方法
     * @param initialCapacity 初始容量
     */
    public MyArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("初始容量必须大于0");
        }
        this.capacity = initialCapacity;
        this.elements = new Object[capacity];
        this.top = -1;  // 栈空时top为-1
    }

    /**
     * 入栈操作
     * @param element 要入栈的元素
     * @return 入栈成功返回true
     */
    public boolean push(E element) {
        // 检查是否需要扩容
        if (top == capacity - 1) {
            resize(capacity * 2);
        }
        elements[++top] = element;
        return true;
    }

    /**
     * 出栈操作
     * @return 栈顶元素
     */
    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空，无法执行出栈操作");
        }
        E element = (E) elements[top];
        elements[top--] = null;  // 帮助GC
        return element;
    }

    /**
     * 查看栈顶元素（不移除）
     * @return 栈顶元素
     */
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return (E) elements[top];
    }

    /**
     * 判断栈是否为空
     * @return 为空返回true
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 获取栈中元素个数
     * @return 元素个数
     */
    public int size() {
        return top + 1;
    }

    /**
     * 清空栈
     */
    public void clear() {
        for (int i = 0; i <= top; i++) {
            elements[i] = null;
        }
        top = -1;
    }

    /**
     * 动态调整数组大小
     * @param newCapacity 新容量
     */
    private void resize(int newCapacity) {
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size());
        elements = newElements;
        capacity = newCapacity;
    }

    /**
     * 打印栈内容（用于调试）
     */
    public void printStack() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return;
        }

        System.out.print("栈底 -> ");
        for (int i = 0; i <= top; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("<- 栈顶");
        System.out.println("当前大小: " + size() + ", 容量: " + capacity);
    }
}
