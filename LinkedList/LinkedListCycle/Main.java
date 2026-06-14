// leetcode Problem 141(Linked List)
//Linked List Cycle

// Main class
public class Main {

    public static void main(String[] args) { // < main method

        // input given to check the code
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;

        // creating the object of a solution class
        Solution sol = new Solution();

        // printing the result by calling the solution method using the name of it and the object of the soltution class
        System.out.println(sol.hasCycle(head));

    }
}
