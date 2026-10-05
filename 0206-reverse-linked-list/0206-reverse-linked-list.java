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
    public ListNode reverseList(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode fir=head;
        ListNode sec=fir.next;
        while(sec!=null){
            fir.next=sec.next;
            sec.next=dummy.next;
            dummy.next=sec;
            sec=fir.next;
        }
        return dummy.next;
    }
}