package Stack_Queue.example1;

/**
 * 链表节点类
 * @param <E> 节点元素类型
 */
class Node<E> {
    E data;           // 节点数据
    Node<E> next;     // 下一个节点引用

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
}

/**
 * 链表实现栈
 * @param <E> 栈元素类型
 */
public class MyLinkedStack<E> {
    private Node<E> top;    // 栈顶节点
    private int size;       // 栈大小

    /**
     * 默认构造方法
     */
    public MyLinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * 入栈操作
     * @param element 要入栈的元素
     * @return 入栈成功返回true
     */
    public boolean push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = top;  // 新节点指向原来的栈顶
        top = newNode;       // 更新栈顶指针
        size++;
        return true;
    }

    /**
     * 出栈操作
     * @return 栈顶元素
     */
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空，无法执行出栈操作");
        }
        E element = top.data;
        top = top.next;  // 栈顶指向下一个节点
        size--;
        return element;
    }

    /**
     * 查看栈顶元素（不移除）
     * @return 栈顶元素
     */
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return top.data;
    }

    /**
     * 判断栈是否为空
     * @return 为空返回true
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * 获取栈中元素个数
     * @return 元素个数
     */
    public int size() {
        return size;
    }

    /**
     * 清空栈
     */
    public void clear() {
        // 遍历链表，帮助GC
        while (top != null) {
            Node<E> temp = top;
            top = top.next;
            temp.data = null;
            temp.next = null;
        }
        size = 0;
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
        Node<E> current = top;
        // 由于栈是反向存储的，需要先反转打印顺序
        java.util.Stack<E> tempStack = new java.util.Stack<>();
        while (current != null) {
            tempStack.push(current.data);
            current = current.next;
        }

        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.pop() + " ");
        }
        System.out.println("<- 栈顶");
        System.out.println("当前大小: " + size);
    }

    /**
     * 检查栈中是否包含指定元素
     * @param element 要查找的元素
     * @return 包含返回true
     */
    public boolean contains(E element) {
        Node<E> current = top;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}