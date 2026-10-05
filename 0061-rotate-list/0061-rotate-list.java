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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode dummy=head;
        int pos=1;
        if(head==null || head.next==null || k==0){
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
            pos++;
        }
        k=k%pos;
        if(k==0){
            return head;
        }
        temp.next=head;
        int mov=pos-k;
        mov--;
        while(mov!=0){
            dummy=dummy.next;
            mov--;
        }
        head=dummy.next;
        dummy.next=null;
        return head;
    }
}