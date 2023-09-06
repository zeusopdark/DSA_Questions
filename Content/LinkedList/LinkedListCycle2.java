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
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer>map=new HashMap<>();
        
        ListNode curr=head;
        int i=0;
        while(true){
            if(curr==null)return null;
            
            if(map.containsKey(curr)){
                return curr;
            }
            else{
                map.put(curr,i);
                i++;
                curr=curr.next;
            }
        }
        // return new ListNode(-1);
    }
}
