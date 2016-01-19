package solution;
import reference.ListNode;

public class Q237 {

	public static void main(String args[]) {
		ListNode head = null, p = null;
		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				head = p = new ListNode(1);
			} else {
				p.next = new ListNode(i);
				p = p.next;
			}
		}
		p = head;
		for (int i = 0; i < 5; i++) {
			p = p.next;
		}
		Q237 s = new Q237();
		s.printlnList(head);
		s.deleteNode(p);
		s.printlnList(head);
	}

	public void deleteNode(ListNode node) {
		if (node == null) {
			return;
		}
		node.val = node.next.val;
		node.next = node.next.next;
	}

	private void printlnList(ListNode node) {
		ListNode p = node;
		while (p != null) {
			System.out.print(String.format("%d->", p.val));
			p = p.next;
		}
		System.out.println("null");
	}

}
