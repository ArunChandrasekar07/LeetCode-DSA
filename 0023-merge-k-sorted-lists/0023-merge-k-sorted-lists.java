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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans=new ListNode();
        ListNode move=ans;
        boolean check=true;
        while(check){
            ListNode min=new ListNode();
            min=null;
            int temp=Integer.MAX_VALUE;
            int j=0;
            for(int i=0;i<lists.length;i++){
                ListNode start=lists[i];
                if(start!=null && start.val<temp){
                    min=start;
                    j=i;
                    temp=start.val;
                }
            }
            if(min==null){
                 break;
            }
            move.next=min;
            move=move.next;
            lists[j]=lists[j].next;
        }
        return ans.next;
    }
}