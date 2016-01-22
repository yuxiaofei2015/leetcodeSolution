package solution;

import reference.ListNode;

public class Q206 {
	/* Iterate */
	// public ListNode reverseList(ListNode head) {
	// ListNode p1 = head;
	// ListNode newHead = null;
	// while (p1 != null) {
	// ListNode temp = p1;
	// p1 = p1.next;
	// temp.next = newHead;
	// newHead = temp;
	// }
	// return newHead;
	// }
	private ListNode last = null;

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			last = head;
			return head;
		} else {
			ListNode newHead = reverseList(head.next);
			last.next = head;
			head.next = null;
			last = head;
			return newHead;
		}
	}
}
