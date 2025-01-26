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

        // Initialize a temporary pointer to traverse the list without affecting the original `head`.
        ListNode temp = head;

        // Handle edge cases where rotation is not required:
        // If the list is empty or contains a single node, return the original `head` as no rotation is needed.
        if (head == null || head.next == null) {
            return head;
        }

        // Calculate the effective rotations required.
        // Use the length of the list to reduce the rotation count (k % list length).
        int c = k % findlen(head);

        // Initialize a counter to track the number of rotations completed.
        int count = 0;

        // Loop until all effective rotations (`c`) are completed or `temp` reaches the end of the list.
        while (temp != null && count < c) {

            // Check if the current node (`temp`) is the second-last node in the list.
            if (temp.next.next == null) {

                // Store the last node in the list (`temp.next`), as it will become the new head.
                ListNode rotate = temp.next;

                // Disconnect the last node from the second-last node by setting `temp.next` to `null`.
                temp.next = null;

                // Link the stored last node (`rotate`) to the current head of the list, forming a loop.
                rotate.next = head;

                // Update the head to point to the new starting node (`rotate`).
                head = rotate;

                // Reset `temp` to start traversal again from the new head.
                temp = head;

                // Increment the rotation counter since one rotation has been performed.
                count++;
            } else {
                // If `temp` is not the second-last node, move to the next node in the list.
                temp = temp.next;
            }
        }

        // After completing all rotations, return the updated head of the list.
        return head;
    }

    // Function to calculate the length of the linked list.
    public int findlen(ListNode head) {
        // Temporary pointer to traverse the list.
        ListNode temp = head;

        // Initialize a counter to keep track of the total number of nodes.
        int count = 0;

        // Traverse the entire linked list until the end is reached.
        while (temp != null) {
            // Increment the counter for each node visited.
            count++;

            // Move the temporary pointer to the next node.
            temp = temp.next;
        }

        // Return the total length of the linked list.
        return count;
    }
}
