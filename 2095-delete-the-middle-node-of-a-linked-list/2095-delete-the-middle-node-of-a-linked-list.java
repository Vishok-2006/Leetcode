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
    public ListNode deleteMiddle(ListNode head) {
         if(head.next==null){
            return head.next;
         }
        ListNode temp=head;
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next !=null){
            if(f.next.next !=null){
                s=s.next;
                f=f.next.next;
            }
            else if(f.next.next ==null &f.next!= null){
                s=s.next;
                f=f.next;
            }
        }
         while( temp.next !=s){
            temp=temp.next;
         }
         temp.next=s.next;
         return head;

    }
}