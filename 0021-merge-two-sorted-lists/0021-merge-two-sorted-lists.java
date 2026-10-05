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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(0);
        ListNode head=ans;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null && temp2!=null){
            int n1=temp1.val;
            int n2=temp2.val;
            if(n1<n2){
                ans.next=temp1;
                temp1=temp1.next;
                ans=ans.next;
            }
            else{
                ans.next=temp2;
                temp2=temp2.next;
                ans=ans.next;
            }
        }
        if(temp1==null){
            ans.next=temp2;
        }
        else if(temp2==null){
            ans.next=temp1;
        }
        return head.next;
    }
}


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
 /*
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mer=new ListNode(0);
        ListNode head=mer;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null && temp2!=null){
            int n1=temp1.val;
            int n2=temp2.val;
            if(n1<n2){
                mer.next=temp1;
                // mer.next=new ListNode(n1); instead create new node use above approach
                mer=mer.next;
                temp1=temp1.next;
            }
            else{
                mer.next=temp2;
                // mer.next=new ListNode(n2); instead create new node use above approach
                mer=mer.next;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
                mer.next=temp2;
            }
            else if(temp2==null){
                mer.next=temp1;
        }
        return head.next;
    }
}
*/