package solution;

import reference.ListNode;

public class Q083 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode p = head;
		while (p != null) {
			ListNode temp = p;
			while (temp.next != null && temp.val == temp.next.val) {
				temp.next = temp.next.next;
			}
			p = p.next;
		}
		return head;
	}
}
