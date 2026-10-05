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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode fir=head;
        ListNode sec=head;
        if(fir!=null){
            sec=sec.next;
        }
        while(sec!=null){
            prev.next=sec;
            fir.next=sec.next;
            sec.next=fir;
            prev=fir;
            fir=prev.next;
            if(fir!=null){
                sec=fir.next;
            }
            else{
                sec=null;
            }
        }
        return dummy.next;
    }
}