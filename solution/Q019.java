package solution;

import reference.ListNode;

/**
 * Created by yuxiaofei on 2016/2/1.
 */
public class Q019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head, p2 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        if (p1.next == null) {
            head = head.next;
            return head;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2 = p2.next;
        return head;
    }
}
