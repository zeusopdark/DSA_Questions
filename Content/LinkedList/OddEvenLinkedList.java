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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)return head;
        ListNode odd=head;//contains the odd node place
        ListNode even=head.next;//contains the even place nodes thats why started from head.next;
        ListNode oddeven=even;//merging both off the odd and even list nodes;
        while(even!=null&&even.next!=null){
            odd.next=even.next;//dry run once and you will get the answer;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=oddeven;//merging process .
        return head;
    }
}
