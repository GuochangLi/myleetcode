package Tree.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<> ();
        postorder(root, nodes);
        return nodes;
    }
    public void postorder(TreeNode root, List<Integer> nodes){
        if(root == null){
            return;
        }
        postorder(root.left, nodes);
        postorder(root.right, nodes);
        nodes.add(root.val);
    }
}
