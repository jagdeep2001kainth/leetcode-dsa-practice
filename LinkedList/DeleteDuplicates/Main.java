// leet code problem main for linkedlist problem2
// Main method

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        Solution sol = new Solution();
        ListNode result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null);
            System.out.print(", ");
            result = result.next;
        }
    }
}
