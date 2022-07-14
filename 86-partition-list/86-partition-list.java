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
    public ListNode partition(ListNode head, int x) {
        //so in this we have to maintain the order of the node means that if any node that is greater than the x node then in that case we have to maintain the order of the linke dlist or the node 
        ListNode s=new ListNode(0);
        ListNode g=new ListNode(0);
        
        ListNode sh=s;
        ListNode gh=g;
        
        while(head !=null){
            if(head.val < x){
                sh.next=head;
                sh=sh.next;
            }
            else{
                gh.next=head;
                gh=gh.next;
            }
            head=head.next;
        }
        gh.next=null;
        sh.next=g.next;
        
        return s.next;
    }
}