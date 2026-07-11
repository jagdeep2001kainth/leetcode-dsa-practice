// leet code problem 94 (stacks)
// Binary Tree Inorder Traversal

//imoport imoortant java utils
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// solution class
public class Solution {

    //solution method
    public List<Integer> inorderTraversal(TreeNode root) {

        //List to store result
        List<Integer> result = new ArrayList<>();

        // declare current node
        TreeNode curr = root;

        // create empty stack
        Stack<TreeNode> stack = new Stack<>();

        // while loop 
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                result.add(curr.val);
                curr = curr.right;
            }

        }
        return result;

    }
}
