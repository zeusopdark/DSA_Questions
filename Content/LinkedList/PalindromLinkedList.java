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
//by using the approach of reversing the other half of the list and comapring each and every elemnt from the first half to the other half of the list using two pointer approach we willl find the midd of the list by making the fast pointer moving one step ahead in each step and slow by one step only same as what we do in inserting the element in mid of the list.
class Solution {
    public boolean isPalindrome(ListNode head) {
    //     ListNode slow=head;
    //     ListNode fast=head;
    //     while(fast!=null&&fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     fast=head;
    //     slow=reverseList(slow);
    //     while(slow!=null){
    //         if(slow.val!=fast.val){
    //             return false;
    //         }
    //         else{
    //             slow=slow.next;
    //             fast=fast.next;
    //         }
    //     }
    //     return true;
    // }
    // public static ListNode reverseList(ListNode head){//function to reverse the second half of the list.
    //     ListNode prev=null;
    //     ListNode nextNode=head;
    //     while(head!=null){
    //         nextNode=head.next;
    //         head.next=prev;
    //         prev=head;
    //         head=nextNode;
    //     }
    //     return prev;
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=head;
        slow=reverse(slow);
        
        while(slow!=null){
           
            if(slow.val!=fast.val)return false;
             fast=fast.next;
             slow=slow.next;
        }
        return true;
	}
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
      ListNode nextNode=head;
        while(head!=null){
            nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }
        return prev;
    }
}
