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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        int c= 0 ;
        if(head.next==null || head==null){
            return null;
        }
        while(temp!=null){
            c++;
            temp=temp.next;
        }

        if(c%2==0){
            while(fast.next.next!=null && fast!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        else{
            while(fast.next.next.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        slow.next=slow.next.next;
        return head;
    }
}