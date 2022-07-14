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
    public ListNode reverseKGroup(ListNode head, int k) {
        //so in this what we have to do is that we hav eot make a dummy listnode  that will point t the head of the linked list and we hav to make the dprev listnode that will point to the dummy of the node we are taking the dummy node beacuse it is eassy for the 
        ListNode dummy=new ListNode(-1,head);
        
        ListNode prev=dummy , nex=dummy , curr=dummy;
        
        int count=0;
        while(curr.next !=null){
            curr=curr.next;
            count++;
        }
        while(count >=k){
            curr=prev.next;
            nex=curr.next;
            for(int i=1;i<k;i++){
                curr.next=nex.next;
                nex.next=prev.next;
                prev.next=nex;
                nex=curr.next;
            }
            prev=curr;
            count-=k;
        }
        return dummy.next;
    }
}