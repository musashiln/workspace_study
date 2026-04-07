package Stack_Queue.example1;

/**
 * ClassName: LinkedDeque
 * Package: Stack_Queue.example1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 22:05
 * @Version 1.0
 */
// 双向链表节点
class DequeNode<T> {
    T data;
    DequeNode<T> prev;
    DequeNode<T> next;

    DequeNode(T data) {
        this.data = data;
    }
}

// 双端队列（双向链表实现）
public class MyLinkedDeque<T> {
    private DequeNode<T> head;
    private DequeNode<T> tail;
    private int size;

    public MyLinkedDeque() {
        head = null;
        tail = null;
        size = 0;
    }

    // 头部添加
    public void addFirst(T item) {
        DequeNode<T> newNode = new DequeNode<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // 尾部添加
    public void addLast(T item) {
        DequeNode<T> newNode = new DequeNode<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // 头部删除
    public T removeFirst() {
        if (isEmpty()) return null;
        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return data;
    }

    // 尾部删除
    public T removeLast() {
        if (isEmpty()) return null;
        T data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
