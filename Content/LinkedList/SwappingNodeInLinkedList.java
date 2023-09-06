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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1=head;
        ListNode p2=head;
        ListNode p3=head;
        
        int n=k-1;
        while(n-->0){
            p1=p1.next;
            p2=p2.next;
        }
        
        while(p2.next!=null){
            p3=p3.next;
            p2=p2.next;
        }
        
        int temp=p3.val;
        p3.val=p1.val;
        p1.val=temp;
        
        return head;
    }
}
