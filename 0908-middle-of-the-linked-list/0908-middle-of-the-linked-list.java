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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        ListNode mid= findmid(head,len/2);
        return mid;
    }
    public ListNode findmid(ListNode head,int k){
        int c=0;
        while(c<k){
            head=head.next;
            c++;
        }
     return head;
    }

}