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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        if(head.next==null){
            return head;
        }
        while(head.next !=null){
            int a=head.val;
            int b=head.next.val;
            ListNode c=head.next;
            while(b!=0){
                int t=b;
                b=a%b;
                a=t;
            }
            head.next=new ListNode(a);
            head.next.next=c;
            head = head.next.next;
        }
        return temp;
    }
}