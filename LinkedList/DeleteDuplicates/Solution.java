// leetcode question for LinkedList Question 2
// in this question we have to eleminate
// the list node which are repeating in the linkeList
// make class soltution

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
