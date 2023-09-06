/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>map=new HashMap<>();
        
        Node dummy=new Node(-1);
        
        Node prev=dummy;
        Node curr=head;
        
        while(curr!=null){
            Node newNode=new Node(curr.val);
            prev.next=newNode;
            map.put(curr,newNode);
            prev=prev.next;
            curr=curr.next;
        }
        Node c1=dummy.next;
        Node c2=head;
        
        while(c2!=null){
            c1.random=c2.random!=null?map.get(c2.random):null;
            c1=c1.next;
            c2=c2.next;
        }
        
        return dummy.next;
    }
}
