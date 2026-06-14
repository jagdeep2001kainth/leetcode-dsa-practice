// leet code problem 88 (Linked List)
// Remove Duplicates from Sorted List

//Main class
public class Main {

    public static void main(String[] args) {// Main Method

        // Givin input of LinkedList Using ListNode
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        // creating sol object of the Solution class
        Solution sol = new Solution();

        // calling the solution method using method name
        //and object of the solution class and storing in result
        ListNode result = sol.deleteDuplicates(head);

        // while loop to check if result is not null
        while (result != null) {

            //printing result value
            System.out.print(result.val);

            // if statement to make sure that result
            // separates with ,
            if (result.next != null);
            System.out.print(", ");

            //iterating through the result
            result = result.next;
        }
    }
}
