package leetcode;

import java.util.HashSet;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		HashSet< ListNode> set = new HashSet<>();
		ListNode temp = head;
		if(temp == null) return false;
		set.add(temp);
		while(temp.next != null) {
			temp = temp.next;
			if(set.contains(temp)) return true;
			set.add(temp);
		}
		return false;
    }
}
