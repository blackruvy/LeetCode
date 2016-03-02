package LeetCode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		int carry = 0, digit = 0;
		ListNode newHead = new ListNode(0);
		ListNode p1 = l1, p2 = l2, p3 = newHead;
		while (p1 != null && p2 != null) {
			digit = (carry + p1.val + p2.val) % 10;
			carry = (carry + p1.val + p2.val) / 10;
			p1 = p1.next;
			p2 = p2.next;
			p3.next = new ListNode(digit);
			p3 = p3.next;
		}
		while (p1 != null) {
			digit = (carry + p1.val) % 10;
			carry = (carry + p1.val) / 10;
			p1 = p1.next;
			p3.next = new ListNode(digit);
			p3 = p3.next;
		}
		while (p2 != null) {
			digit = (carry + p2.val) % 10;
			carry = (carry + p2.val) / 10;
			p2 = p2.next;
			p3.next = new ListNode(digit);
			p3 = p3.next;
		}
		if (carry > 0) {
			p3.next = new ListNode(carry);
		}
		return newHead.next;
	}
}
