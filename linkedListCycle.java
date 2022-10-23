/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        
        ListNode slow = head;
        ListNode fast = slow.next;
        
        while(fast != null)
        {
            if(fast==slow)
            {
                return true;
            }
            slow = slow.next;
            fast = fast.next;
            if(fast != null)
                fast = fast.next;
        }
        return false;
    }
}
