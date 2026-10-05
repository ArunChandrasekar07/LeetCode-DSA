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
    public boolean hasCycle(ListNode head) {
        ListNode one=head;
        ListNode two=head;
        if(head == null) return false;
        while(two!=null && two.next!=null){
            one=one.next;
            two=two.next.next;
            if(one==two){
                return true;
            }
        }
        return false;
    }
}
 
 /* 
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> node=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(node.contains(temp)){
                return true;
            }
            node.add(temp);
            temp=temp.next;
        }
        return false;
    }
} */