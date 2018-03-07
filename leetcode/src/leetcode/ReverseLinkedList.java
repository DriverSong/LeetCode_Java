package leetcode;

public class ReverseLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
    public ListNode reverseList(ListNode head) {
    	//递归做法，每次求reverseList(head.next)，再将head添到得到的链表尾部，但是超时了。
//    	if (head == null) return null;
//        if (head.next != null) {
//			ListNode newhead = reverseList(head.next);
//			ListNode temp = newhead;
//			while(temp.next != null) temp = temp.next;
//			temp.next = head;
//			return newhead;
//		}
//        return head;
    	//动归做法，遍历链表，每次将遍历到的链表元素添到新链表的头部
//    	ListNode newHead = null;
//    	ListNode node = head;
//    	while(node != null) {
//    		ListNode temp = new ListNode(node.val);
//    		temp.next = newHead;
//    		newHead = temp;
//    		node = node.next;
//    	}
//    	return newHead;
    	
    	//Discuss里面的递归解法：
    	/*
    	 * 想法：
    	 * 		遍历一次链表，遍历到第i个元素时，将第i个元素变为前i-1个元素组成的reverseList的head；
    	 * 		函数传递LinkedList(i) 和 前i-1个元素的head，其实就是LinkedList(i - 1);
    	 */
    	return myReverseList(head, null);
    }
	private ListNode myReverseList(ListNode head, ListNode newHead) {
		if (head == null) {
			return newHead;
		}
		ListNode next = head.next;
		head.next = newHead;
		return myReverseList(next, head);
	}
}
