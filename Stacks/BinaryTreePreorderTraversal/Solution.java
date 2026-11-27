
import java.util.*;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {

        // Base condition
        if (node == null) {
            return;
        }

        // 1. Root
        result.add(node.val);

        // 2. Left subtree
        preorder(node.left, result);

        // 3. Right subtree
        preorder(node.right, result);
    }
}
