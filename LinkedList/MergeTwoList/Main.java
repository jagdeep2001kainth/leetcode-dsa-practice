// leet code Linked list question
// merge two sorted lists
// Main.java

public class Main {

    public static void main(String[] args) {
        // Build list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        // Build list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        // Merge
        Solution sol = new Solution();
        ListNode merged = (ListNode) sol.mergeTwoLists(list1, list2);
        // Print result
        ListNode current = merged;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    }
}
