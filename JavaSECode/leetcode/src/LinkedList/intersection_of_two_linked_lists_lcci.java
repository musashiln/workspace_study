package LinkedList;

/**
 * ClassName: intersection_of_two_linked_lists_lcci
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/21 16:30
 * @Version 1.0
 */
public class intersection_of_two_linked_lists_lcci {
}

class Solution2 {
    /**
     * 先找到链表AB的长度，使headA指向更长的链表，
     * 让headA从长链表头节点移动，当走过lenA-lenB长度后，和headB同时移动，
     * 比较是否相等
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a != null) {
            lenA++;
            a = a.next;
        }
        while(b != null) {
            lenB++;
            b = b.next;
        }
        if(lenA < lenB) {
            int tmpLen = lenA;
            lenA = lenB;
            lenB = tmpLen;
            ListNode tmp = headA;
            headA = headB;
            headB = tmp;
        }
        int gap = lenA - lenB;
        a = headA;
        b = headB;
        while (gap-- > 0) {
            a = a.next;
        }
        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;
    }

    /**
     * 合并链表实现
     * 链表A不相交部分长度a，链表B不相交部分长度b，不相交部分长度c
     * 各自遍历后，再遍历另一个链表，这样2个指针都会在相交节点相遇，因为此时都走了a + c + b长度
     * A:a + c + b
     * B:b + c + a
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }
            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }
}
