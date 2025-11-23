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
        ListNode dummy=new ListNode(-101, head);
        ListNode res=dummy, prev=dummy;
        ListNode temp=head;
        while(temp!=null) {
            if(temp.val!=prev.val && (temp.next == null || temp.next.val!=temp.val)) {
                res.next=temp;
                res=temp;
            }
            prev=temp;
            temp =temp.next;
        }
        if(res != null) res.next = null;
        return dummy.next;
    }
}