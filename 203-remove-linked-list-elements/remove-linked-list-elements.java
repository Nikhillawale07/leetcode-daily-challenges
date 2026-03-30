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
    public ListNode removeElements(ListNode head, int val) {

        // Step 1: Remove elements from start
        while (head != null && head.val == val) {
            head = head.next;
        }

        // Step 2: Traverse rest of list
        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.next.val == val) {
                current.next = current.next.next; // delete
            } else {
                current = current.next; // move
            }
        }

        return head;
    }
}