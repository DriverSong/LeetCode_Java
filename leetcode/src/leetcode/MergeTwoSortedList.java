package leetcode;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1);
		ListNode end = head;
		ListNode temp1 = l1;
		ListNode temp2= l2;
		while(!(temp1 == null && temp2 == null)) {
			if (temp1 == null) {
				while(temp2 != null) {
					end.next = temp2;
					temp2 = temp2.next;
					end = end.next;
				}
			}else if (temp2 == null) {
				while(temp1 != null) {
					end.next = temp1;
					temp1 = temp1.next;
					end = end.next;
				}
			}else {
				if (temp1.val>=temp2.val) {
					end.next = temp2;
					temp2 = temp2.next;
					end = end.next;
				}else {
					end.next = temp1;
					temp1 = temp1.next;
					end = end.next;
				}
			}
		}
		return head.next;
    }
}
