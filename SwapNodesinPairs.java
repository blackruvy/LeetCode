package LeetCode;

public class SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null){
			return null;
		}
		if(head.next == null){
			return head;
		}
		ListNode fakehead = new ListNode(0);
		fakehead.next = head;
		ListNode p1 = fakehead;
		ListNode p2 = head;
		while(p2 != null && p2.next != null){
			ListNode temp = p2.next;
			p2.next = temp.next;
			temp.next = p2;
			p1.next = temp;
			
			p1 = p2;
			p2 = p2.next;
			
		}
		return fakehead.next;
	}
}
