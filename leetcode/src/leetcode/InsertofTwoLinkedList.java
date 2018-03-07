package leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.Templates;

public class InsertofTwoLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	//my solution
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<>();
		if (headA == null || headB == null) return null;
		ListNode temp = headA;
		while(temp != null) {
			set.add(temp);
			temp = temp.next;
		}
		temp = headB;
		while(temp != null) {
			if (set.contains(temp)) return temp;
			temp = temp.next;
		}
		return null;
    }
	//link the two list and then find if the new linked_list has cycle.
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode a = headA;
		ListNode b = headB;
		/*
		 * 此题在于如何将两个链表的尾部对齐：
		 * 		若存在公共节点，则从第一个公共节点到尾部之间所有的节点，均相同；
		 * 		当两个链表长度不同的时候，设n>m，则公共节点不可能存在于前n-m个节点中；
		 * 		若存在于前n-m个节点中，则公共节点的个数不同，是矛盾的。
		 * 		所以只需将较长链表的头部截去，再进行遍历，查看剩余的对应位置节点是否相同，就可以找到公共节点。
		 * 此方法有两个遍历，第一个遍历两个链表均遍历一遍自身，在遍历完自身后，进行第二次遍历，即遍历另外一个链表;
		 * 当两个链表长度相同时，第一次遍历就能判断是否有公共节点；
		 * 当两个链表长度不同时，第一次遍历不能做出判断；但第二次遍历时，可以做出判断：
		 * 		由于两个遍历的长度m+n=n+m，在第二次遍历时，不管哪个链表长度较长，
		 * 		我们都可以将它们的尾部对齐，当尾部对齐时，接相当于截去了较长链表的多余部分，所以可以实现。
		 */
		while(a != b) {
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}
		return a;
    }
}
