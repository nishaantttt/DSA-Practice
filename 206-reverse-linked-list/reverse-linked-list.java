class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next; // Store next node
            curr.next = prev; // Reverse pointer
            prev = curr; // Move prev ahead
            curr = nextTemp; // Move curr ahead
        }
        
        return prev; // New head
    }
}
