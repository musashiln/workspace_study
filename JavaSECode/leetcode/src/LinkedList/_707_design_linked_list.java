package LinkedList;

/**
 * ClassName: design_linked_list_707
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/20 21:05
 * @Version 1.0
 */
public class _707_design_linked_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.getHead());
        myLinkedList.addAtHead(1);
        myLinkedList.print();

    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {

    private int size;
    private ListNode head;

    public int getSize() {
        return size;
    }

    public ListNode getHead() {
        return head.next;
    }

    public void setHead(ListNode head) {
        this.head.next = head;
    }

    /**
     * 虚拟头节点
     */
    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    /**
     * index是指原本链表中(不带虚拟头节点)位置，从0开始到size-1结束
     * 所以加上虚拟头节点后，原index变成index+1
     * 结束时，i=index+1，正好指向链表中的第index+1个节点(从0开始)
     * @param index
     * @return
     */
    public int get(int index) {
        if(index < 0 || index > size - 1) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i < index + 1; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode addNode = new ListNode(val);
        addNode.next = head.next;
        head.next = addNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode addNode = new ListNode(val);
        ListNode pre = head;
        while(pre.next != null) {
            pre = pre.next;
        }
        pre.next = addNode;
        size++;
    }

    /**
     * 加入的index正常范围是0-size，由此写出不正常的范围
     * 插入和删除都需要找到index的前一个，index-1，但是因为加入了虚拟头节点，所以实际上pre下标是index
     * 所以for循环结束条件是<index，退出时i=index，正好指向pre
     * @param index
     * @param val
     */
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode addNode = new ListNode(val);
        addNode.next = pre.next;
        pre.next = addNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index > size - 1) {
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }

    public void print() {
        ListNode cur = head;
        while (cur.next != null) {
            System.out.print(cur.next.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
}
