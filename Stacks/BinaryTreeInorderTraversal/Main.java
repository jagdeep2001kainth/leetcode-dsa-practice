
import java.util.List;

// main class
public class Main {

    //main method
    public static void main(String[] args) {

        // build tree: 1 -> right -> 2 -> left -> 3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // making soluton class method to call
        // the object
        Solution sol = new Solution();

        //calling the method
        List<Integer> result = sol.inorderTraversal(root);

        //printing the result
        System.out.println(result);

    }
}
