/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode one=head;
        ListNode two=head;
        ListNode start=head;
        while(two!=null && two.next!=null){
            one=one.next;
            two=two.next.next;
            if(one==two){
                while(start!=one){
                    start=start.next;
                    one=one.next;
                }
                return start;
            }
        }
        return null;
    }
}

/* public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hm=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(hm.contains(temp)){
                return temp;
            }
            hm.add(temp);
            temp=temp.next;
        }
        return null;
    }
} */