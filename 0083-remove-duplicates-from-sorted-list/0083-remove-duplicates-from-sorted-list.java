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
        if(head==null)return head;
        ListNode temp=head;
        ListNode prevhead=head;
        int prevval=head.val;
        while(temp!=null){
            if(temp.val!=prevval){
                prevhead.next=temp;
                prevhead=prevhead.next;
                prevval=temp.val;
            }
            temp=temp.next;
        }
        prevhead.next=null;
        return head;
    }
}