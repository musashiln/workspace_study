package LinkedList;

/**
 * ClassName: hasCycle
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/20 22:59
 * @Version 1.0
 */
public class hasCycle {
    public static void main(String[] args) {

    }
}

class Solution{
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
