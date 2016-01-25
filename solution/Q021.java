package solution;

import reference.ListNode;

public class Q021 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode head = null, p = null, p1 = l1, p2 = l2;
		while (p1 != null && p2 != null) {
			ListNode temp = null;
			if (p1.val < p2.val) {
				temp = p1;
				p1 = p1.next;
			} else {
				temp = p2;
				p2 = p2.next;
			}
			if (head == null) {
				head = p = temp;
			} else {
				p.next = temp;
				p = p.next;
			}
		}
		if (p1 == null) {
			p.next = p2;
		}
		if (p2 == null) {
			p.next = p1;
		}
		return head;
	}
}
