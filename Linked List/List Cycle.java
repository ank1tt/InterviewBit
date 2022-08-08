public class Solution {
	public ListNode detectCycle(ListNode a) {
        ListNode curr = a;
        ListNode slow = a;
        ListNode fast = a;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                while(slow != curr){
                    slow = slow.next;
                    curr = curr.next;
                }
                return curr;
            }
        }
        return null;
	}
}

