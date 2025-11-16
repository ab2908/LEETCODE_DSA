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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head){
        ListNode reversed=reverse(head);
        ListNode it=reversed; 
        while(it.next!=null){ 
            if(it.next.val<it.val){
                it.next=it.next.next;
            }
            else{
                it=it.next;
            }
        }
        return reverse(reversed);
    }
}