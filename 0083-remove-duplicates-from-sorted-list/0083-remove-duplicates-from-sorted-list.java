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
        ListNode fir=head;
        if(fir==null || fir.next==null){
            return head;
        }
        ListNode sec=fir.next;
        while(sec!=null){
            if(fir.val==sec.val){
                fir.next=sec.next;
                sec=fir.next;
            }
            else{
                fir=fir.next;
                sec=sec.next;
            }
        }
        return head;
    }
}