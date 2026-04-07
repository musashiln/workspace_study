package LinkedList;

/**
 * ClassName: _707_design_linked_list_double
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/22 13:11
 * @Version 1.0
 */
public class _707_design_linked_list_double {
    public static void main(String[] args) {
        MyDoubleLinkedList myLinkedList = new MyDoubleLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.print();
        myLinkedList.addAtTail(3);
        myLinkedList.print();
        myLinkedList.addAtIndex(1, 2);    // 链表变为 1->2->3
        myLinkedList.print();
        System.out.println(myLinkedList.get(1));// 返回 2
        myLinkedList.print();
        myLinkedList.deleteAtIndex(1);    // 现在，链表变为 1->3
        myLinkedList.print();
        System.out.println(myLinkedList.get(1));
    }
}

class DoubleListNode {
    int val;
    DoubleListNode pre;
    DoubleListNode next;

    public DoubleListNode() {
    }

    public DoubleListNode(int val) {
        this.val = val;
    }

    public DoubleListNode(int val, DoubleListNode pre, DoubleListNode next) {
        this.val = val;
        this.pre = pre;
        this.next = next;
    }
}

class MyDoubleLinkedList {

    int size;
    DoubleListNode head, tail;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.head = new DoubleListNode(0);
        this.tail = new DoubleListNode(0);
        this.head.next = tail;
        this.tail.pre = head;
    }

    public int get(int index) {
        if(index < 0 || index > size - 1) {
            return -1;
        }
        DoubleListNode cur = null;
        if(index >= size / 2) {
            cur = tail;
            //从index开始到最后一个节点的节点数：(size-1)-(index-1)=size-index
            //即不算虚拟节点tail，共有size-index个节点
            //从tail是第0个倒着数，原第index个正好是现在的第size-index个
            //如head 1 2 3 4 tail ,2的原index是1，倒数index是2
            //
            // 或者，思考不加虚拟节点时，倒数index=(0+size-1-index)，
            //有虚拟节点tail，则现在的倒数index为size-index
            for (int i = 0; i < size - index; i++) {
                cur = cur.pre;
            }
        } else {
            cur = head;
            for (int i = 0; i < index + 1; i++) {
                cur = cur.next;
            }
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        DoubleListNode newNode = new DoubleListNode(val);
        newNode.next = head.next;
        newNode.pre = head;
        head.next.pre = newNode;
        head.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        DoubleListNode newNode = new DoubleListNode(val);
        newNode.pre = tail.pre;
        newNode.next = tail;
        tail.pre.next = newNode;
        tail.pre = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }
        DoubleListNode newNode = new DoubleListNode(val);
        DoubleListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        newNode.pre = pre;
        newNode.next = pre.next;
        pre.next.pre = newNode;
        pre.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size - 1) {
            return;
        }
        DoubleListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next.next.pre = pre;
        pre.next = pre.next.next;
        size--;
    }

    public DoubleListNode getHead() {
        return head.next;
    }

    public void setHead(DoubleListNode head) {
        this.head.next = head;
    }

    public void print() {
        DoubleListNode cur = head.next;
        for (int i = 1; i < size + 1; i++) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
}
