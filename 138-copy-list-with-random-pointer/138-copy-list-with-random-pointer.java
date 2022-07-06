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
        //there are certain steps that u need to follow to solve this problem there are three steps to solve this problem 
        //step 1
        Node iter=head;
        Node front=head;
        while(iter !=null){
            front=iter.next;
            Node copy=new Node(iter.val);
            iter.next=copy;
            copy.next=front;
            iter=front;
        }
        //step 2
        iter=head;
        while(iter !=null){
            if(iter.random !=null){
                iter.next.random=iter.random.next;
            }
            iter=iter.next.next;
        }
        //step 3
        Node dummy = new Node(0);
    iter = head;
    Node temp = dummy;
    Node fast;
    while(iter != null) {
        fast = iter.next.next;
        temp.next = iter.next;
        iter.next = fast;
        temp = temp.next;
        iter = fast;
    }
    return dummy.next;
    }
}