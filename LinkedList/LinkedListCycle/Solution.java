// leetcode Problem 141(Linked List)
//Linked List Cycle

//Solution class
public class Solution {

    // Solution method
    public boolean hasCycle(ListNode head) {

        //will iterate slower in the loop
        ListNode slow = head;

        //will iterate faster in the loop
        ListNode fast = head;

        // while loop to check if the current and next node is not null
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            //if condition to check if the slow is equal to fast
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
