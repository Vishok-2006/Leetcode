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
    public ListNode deleteDuplicates(ListNode head) {
      ListNode d=new ListNode(0);
      ListNode p=d;
      ListNode c=head;
      while(c!=null){
        if(c.next!=null && c.val==c.next.val){
            while(c.next!=null && c.val==c.next.val){
                c=c.next;
            }
            p.next=c.next;
        }
        else{
            p.next=c;
            p=p.next;
      }
        c=c.next;
      }
      return d.next;
    }
}