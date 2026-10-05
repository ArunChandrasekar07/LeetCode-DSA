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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==1 && right==1){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode ans=dummy;
        ListNode fir=head;
        ListNode sec=head;
        sec=sec.next;
        int pos=right-left;
        int num=pos;
        pos--;
        int l=left;
        l--;
        while(l!=0){
            dummy=dummy.next;
            fir=fir.next;
            sec=sec.next;
            l--;
        }
        while(num>0){
            fir.next=sec.next;
            sec.next=dummy.next;
            dummy.next=sec;
            sec=fir.next;
            num--;
        }
        return ans.next;
    }
}