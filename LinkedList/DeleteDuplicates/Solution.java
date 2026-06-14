// leet code problem 88 (Linked List)
// Remove Duplicates from Sorted List

//Solution class
public class Solution {

    //Solution Method
    public ListNode deleteDuplicates(ListNode head) {

        // assign head as the current listnode
        ListNode current = head;

        // while loop to check if the current listn and next listnode is not null
        while (current != null && current.next != null) {

            // if statement to check if the current listnode is not equal to the next listnode
            if (current.val == current.next.val) {

                // current.next.next will skip the duplicate
                current.next = current.next.next;

                //else statment if the there is no duplicate
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
