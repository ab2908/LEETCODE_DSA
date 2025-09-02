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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode ptr = head;
        while (ptr != null) 
        {
            count++;
            ptr = ptr.next;
        }

        int c = count - n;

        if (c == 0) 
        {
            return head.next;
        }

        ptr = head;
        for (int i = 1; i < c; i++) 
        {
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return head;
    }
}
