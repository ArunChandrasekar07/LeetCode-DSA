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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode trav=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len==1 && n==1){
            return null;
        }
        int pos=len-n;
        if(pos==0){
            return head.next;
        }
        pos--;
        while(pos!=0){
            trav=trav.next;
            pos--;
        }
        trav.next=trav.next.next;
        return head;
    }
}

/* class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
} */