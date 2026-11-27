
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Creating binary tree
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Create Solution object
        Solution solution = new Solution();

        // Call preorder traversal
        List<Integer> result
                = solution.preorderTraversal(root);

        // Print result
        System.out.println("Preorder Traversal: " + result);
    }
}
