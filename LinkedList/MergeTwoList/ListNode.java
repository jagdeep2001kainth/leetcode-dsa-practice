// A ListNode represents one node in a Linked List

// class ListNode
public class ListNode {

    // Stores the actual data/value of the node
    int val;

    // Stores the address of the next node
    ListNode next;

    //this constructor is always called when creating new node
    ListNode(int val) {

        // Assign the value passed into the constructor
        // to this node's val variable
        this.val = val;

        // When a new node is created, it is not connected
        // to any other node yet, so next is set to null
        this.next = null;
    }
}
