package LinkedList;

/**
 * ClassName: _203_remove_linked_list_elements
 * Package: LinkedList
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 17:06
 * @Version 1.0
 */
public class _203_remove_linked_list_elements {

    /**
     * 如果头节点等于val，则头节点等于下一个节点，(while)
     * 确定头节点后，其他节点正常移除，最后返回head
     * 时间复杂度: O(n)
     * 空间复杂度: O(1)
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElement(ListNode head, int val) {
        //短路判断，head!=null在前，不然后面head.val可能空指针
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode cur = head;
        while (cur != null && cur.next != null) {  //当移动到null时，需要判断cur!=null
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    //    public ListNode removeElements(ListNode head, int val) {
//        while(head != null && head.val == val) {
//            head = head.next;
//        }
//        ListNode cur = head.next;   //不能认为这时head就不是null了，因为可能list为空
//        while(cur != null && cur.next != null) {
//            if(cur.next.val == val) {
//                cur.next = cur.next.next;
//            }
//            cur = cur.next;   //删除过后不能直接指向下一个，下一个也可能要删除，指针必须在可能要删除的节点前面
//        }
//        return head;
//    }

    /**
     * 同法一，增加对head移除完后的判断
     * 两个指针操作
     * 时间复杂度: O(n)
     * 空间复杂度: O(1)
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElement1(ListNode head, int val) {
        while (head.val == val && head != null) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        while (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (pre != null && cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;   //注意cur也要移动，cur = cur.next;加上后这句可以移动到if外
            } else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return head;
    }




    /**
     * 增加虚拟头节点，使操作一致
     * 时间复杂度: O(n)
     * 空间复杂度: O(1)
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElement2(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    /**
     * 递归，链表处理，相当于头节点与下一个节点当头节点的链表的处理
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     */
    public ListNode removeElement3(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        // 假设 removeElements() 返回后面完整的已经去掉val节点的子链表
        // 在当前递归层用当前节点接住后面的子链表
        // 随后判断当前层的node是否需要被删除，如果是，就返回
        // 也可以先判断是否需要删除当前node，但是这样条件语句会比较不好想
        head.next = removeElement3(head.next, val);  //head.next=返回的子链表
        if (head.val == val) {
            return head.next;
        }
        return head;
    }

}

class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(6);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.addAtTail(6);

        System.out.println("初始链表:");
        list.print();

        _203_remove_linked_list_elements removeLinkedListElements = new _203_remove_linked_list_elements();
        //list.setHead(removeLinkedListElements.removeElement(list.getHead(),6));
        //list.setHead(removeLinkedListElements.removeElement1(list.getHead(),6));
        //list.setHead(removeLinkedListElements.removeElement2(list.getHead(),6));


    }
}
