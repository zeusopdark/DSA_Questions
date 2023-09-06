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
//We can solve this problem using stack as well store all the value of list 1 and list 2 respectively in two different stacks and start accessing the values from top just do a pen paper and you will easily understand.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a=reverse(l1);
        ListNode b=reverse(l2);
        
        ListNode dummy = new ListNode(0);
        ListNode ans=dummy;
        
        int count=0;
        while(a!=null||b!=null||count>0){
            int val1=0,val2=0;
            if(a!=null)
            val1=a.val;
            if(b!=null)
            val2=b.val;
           
           int sum=count+val1+val2;
           ListNode curr=new ListNode(sum%10);
            ans.next=curr;
            ans=curr;
            
            count=sum/10;
            if (a!=null)
            a=a.next;
            if (b!=null)
            b=b.next;
        }
        return reverse(dummy.next);
        
    }
    public ListNode reverse(ListNode l1){
        
        ListNode prev=null;
        
        
        ListNode current=l1;
        
        while(current!=null){
            ListNode nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;
        }
        
        return prev;
    }
}
