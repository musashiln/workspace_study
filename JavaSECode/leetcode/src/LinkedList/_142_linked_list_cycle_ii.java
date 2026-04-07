package LinkedList;

/**
 * ClassName: _142_linked_list_cycle_ii
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/21 10:39
 * @Version 1.0
 */
public class _142_linked_list_cycle_ii {

}

/**
 * L = y + z
 * slow = x + y
 * fast = 2 (x + y)
 *
 * fast - slow = (x + y) = nL
 * x + y = n (y + z)
 * x = (n - 1)(y + z) + z
 *
 * x = (n - 1)L + z
 *
 * 注意,当slow从环入口进环后，走不到一圈就会被fast追上，
 * 因为fast和slow之间最多差L步，而L步fast用L次更迭就能追上(因为相对速度是1每次缩短一个节点长度的距离)
 *
 * 时间复杂度: O(n)，快慢指针相遇前，指针走的次数小于链表长度，快慢指针相遇后，两个index指针走的次数也小于链表长度，总体为走的次数小于 2n
 * 空间复杂度: O(1)
 *
 */
class Solution1 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode index1 = head;
                ListNode index2 = fast;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
