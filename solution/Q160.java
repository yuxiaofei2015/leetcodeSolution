package solution;

import reference.ListNode;

/**
 * Created by yuxiaofei on 2016/1/28.
 */
public class Q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p2;
    }
}
