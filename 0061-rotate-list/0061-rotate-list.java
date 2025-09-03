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
        if(head==null || k==0) return head;
        int len=1;
        ListNode t= head;
        while(t.next!=null){
             len++;
             t=t.next;
        }
        if(k%len==0){
            return head;
        }
        k=k%len;
        t.next=head;
        ListNode nthnode= findnthnode(head,len-k);
        head=nthnode.next;
        nthnode.next=null;
        return head;   
    }
    public ListNode findnthnode(ListNode head, int k){
        int c =1;
        while(head!=null){
          if(c==k) return head;
          c++;
          head=head.next;
        }
        return head;
    }
}