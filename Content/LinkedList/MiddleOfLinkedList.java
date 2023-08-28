/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return count%2==0?slow.next:slow;
    }
}
