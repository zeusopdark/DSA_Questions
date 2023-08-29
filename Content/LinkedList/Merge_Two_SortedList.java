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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1;
        ListNode l2=list2;
        
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                ListNode node=new ListNode(l2.val);
                prev.next=node;
                prev=node;
                l2=l2.next;
            }
            else{
                ListNode node=new ListNode(l1.val);
                prev.next=node;
                prev=node;
                l1=l1.next; 
            }
        }
        
        if(l1!=null){
            prev.next=l1;
        }
        if(l2!=null){
            prev.next=l2;
        }
        
        return dummy.next;
    }
}
