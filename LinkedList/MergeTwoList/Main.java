// leet code question 21 (LinkedList)
// merge two sorted lists

// Main class
public class Main {

    public static void main(String[] args) {// Main Method

        // Input = Build list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Input = Build list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        //creating an object sol of the solution class
        Solution sol = new Solution();

        //calling solution method using method name and object name of solution class
        // saving it in listnode merged
        ListNode merged = (ListNode) sol.mergeTwoLists(list1, list2);

        // Print result
        // naming the merged as current
        ListNode current = merged;

        //while loop to iterate through the linkedlist result
        while (current != null) {

            //printing the value/result
            System.out.print(current.val);

            //adding -> between the ListNodes
            if (current.next != null) {
                System.out.print(" -> ");
            }

            //traversing through the LinkedList
            current = current.next;
        }

    }
}
