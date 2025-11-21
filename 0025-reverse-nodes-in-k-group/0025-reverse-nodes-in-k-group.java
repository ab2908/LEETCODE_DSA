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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp; 
        ListNode prev=null;
        temp=head;
        while(temp!=null){
            ListNode kth=findkth(temp,k);
            if(kth==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            ListNode newNode =kth.next;
            kth.next=null;
            ListNode newhead=reversell(temp);
            if(temp==head){
                head=newhead;
            }
            else{
                prev.next=newhead;
            }
            prev=temp;
            temp=newNode;
        }
        return head;
    }
    public static ListNode findkth(ListNode t,int k){
        k-=1;
        while(t!=null && k>0){
            k--;
            t=t.next;
        }
        return t;
    }

    public static ListNode reversell(ListNode t){
        ListNode temp=t;
        ListNode prev = null;
        while (temp!= null) {
            ListNode front= temp.next;
            temp.next=prev;
            prev=temp;
            temp= front;
        }
        return prev;
    }
}