// leet code question 21 (LinkedList)
// merge two sorted lists

//Solution class
public class Solution {

    //Solution Method
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // declaring a dummy node
        ListNode dummy = new ListNode(-1);

        // declaring the dummy node as current
        ListNode current = dummy;

        // while loop to check if the list1 and list2 are not null
        while (list1 != null && list2 != null) {

            // which list node has smaller value will get attached to the dummy node first
            if (list1.val <= list2.val) {
                current.next = list1;

                // go to the next node in the same list
                list1 = list1.next;

                // else statement if list2 is smaller than next Listnode that will be joined is list2
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            //moving to the next ListNode
            current = current.next;
        }

        //checking if the ListNode in list 1 is null, then the pending last listnode of list2 will the the last listnode/tail
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        // return dummy.next cause dont wont the -1 dummy node
        return dummy.next;
    }
}
