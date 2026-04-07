package LinkedList;

/**
 * ClassName: _19_remove_nth_node_from_end_of_list
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/21 17:44
 * @Version 1.0
 */
public class _19_remove_nth_node_from_end_of_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.print();
        Solution3 solution = new Solution3();
        ListNode listNode = solution.removeNthFromEnd(myLinkedList.getHead(), 1);
        myLinkedList.setHead(listNode);
        myLinkedList.print();
    }
}

class Solution3 {
    /**
     *当fast指针从虚拟头节点移动n时，slow出发，两个指针一直相差n步，
     * 当fast指向null时，slow到倒数第n个节点
     * 但是要删除倒数第n个，需要slow指向第n-1个节点
     * 所以fast需要从虚拟头节点移动n+1
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next != null) {
            slow.next = slow.next.next;
        }
        return dummy.next;
    }


//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode fast = dummy, slow = dummy;
//        for (int i = 0; i < n + 1; i++) {
//            fast = fast.next;
//        }
//        while (fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;  //注意空指针判断，有可能原本就是空链表
//        return head;   //如果head就是被删除的节点，则可能导致结果错误，实际上应该返回dummy的后一个
//    }

    /**
     * 当递归从末尾开始返回时，每个节点都会知道从它到末尾的节点数，当遇到倒数第n个节点的前一个节点时，就删除倒数第n个节点。
     *
     * 注意：这里递归的返回值表示的是从当前节点到链表末尾的节点数（包括当前节点）。所以，当我们在某个节点处得到的net等于n时，
     * 说明当前节点的下一个节点是倒数第n个节点，因为从下一个节点开始到末尾的节点数正好是n。
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode s = new ListNode(-1, head);
        remove(s, n);
        return s.next;
    }

    public int remove(ListNode p, int n) {
        if (p == null) {
            return 0;
        }
        //如果net等于n，说明当前节点p的下一个节点就是倒数第n个节点，
        // 因此删除p.next（即p.next = p.next.next）。
        int net = remove(p.next, n);
        if (net == n) {
            p.next = p.next.next;
        }
        //返回net + 1，表示从当前节点到末尾的节点数（包括当前节点）
        return net + 1;
    }

    //https://chat.deepseek.com/share/a8aqo1lb2lh8z7ibfz


}
