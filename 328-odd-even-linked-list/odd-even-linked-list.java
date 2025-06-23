/**
 * Definition for singly-linked list.
 * public class Node {
 *     int val;
 *     Node next;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }

        ListNode odd=head;
        ListNode even = head.next;
        ListNode evenhead=even;
        while(even!=null && even.next!=null){
        odd.next=odd.next.next;
        odd=odd.next;

        even.next=even.next.next;
        even=even.next;

        }

        odd.next=evenhead;
        return head;

    }
}