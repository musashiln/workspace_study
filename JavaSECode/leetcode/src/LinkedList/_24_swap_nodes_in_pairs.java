package LinkedList;

/**
 * ClassName: _24_swap_nodes_in_pairs
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/22 10:57
 * @Version 1.0
 */
public class _24_swap_nodes_in_pairs {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.print();
        Solution5 solution5 = new Solution5();
        ListNode head = solution5.swapPairs1(list.getHead());
        list.setHead(head);
        list.print();
    }
}

class Solution5 {
    /**
     * 画图
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode cur = dummyNode;
        ListNode temp = null;
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next;
            cur.next.next = cur.next.next.next;
            temp.next = cur.next;
            cur.next = temp;
            cur = cur.next.next;
        }
        return dummyNode.next;
    }

    public ListNode swapPairs1(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode cur = dummyNode;
        ListNode temp = null;
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next;
            cur.next = cur.next.next;
            temp.next = cur.next.next;
            cur.next.next = temp;
            cur = cur.next.next;
        }
        return dummyNode.next;
    }


}
