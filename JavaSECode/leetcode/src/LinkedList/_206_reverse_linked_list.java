package LinkedList;

/**
 * ClassName: _206_reverse_linked_list
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/21 22:15
 * @Version 1.0
 */
public class _206_reverse_linked_list {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.print();
        Solution4 solution = new Solution4();
        list.setHead(solution.reverseList(list.getHead()));
        list.print();
    }
}

class Solution4 {
    /**
     * 双指针
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    /**
     * 递归
     */
    public ListNode reverseList1(ListNode head) {
         return reverse(head, null);
    }

    public ListNode reverse(ListNode cur, ListNode pre) {
        if(cur == null) {
            return pre;
        }
        ListNode temp = null;
        temp = cur.next;
        cur.next = pre;
        //与双指针操作对应
        //pre = cur;
        //cur = temp;
        return reverse(temp, cur);
    }
}
