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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode fir=head;
        if(fir==null || fir.next==null){
            return fir;
        }
        ListNode sec=fir.next;
        while(sec!=null){
            if(fir.val==sec.val){
                while(sec!=null && sec.val==fir.val){
                    sec=sec.next;
                }
                prev.next=sec;
                if(prev.next==null){
                    break;
                }
                fir=prev.next;
                sec=fir.next;
            }
            else{
                prev=prev.next;
                fir=fir.next;
                sec=sec.next;
            }
        }
        return dummy.next;
    }
}