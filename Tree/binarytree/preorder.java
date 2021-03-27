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

public class preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<> ();
        preorder(root, nodes);
        return nodes;
    }
    public void preorder(TreeNode root, List<Integer> nodes){
        if(root == null){
            return;
        }
        nodes.add(root.val);
        preorder(root.left, nodes);
        preorder(root.right, nodes);
    }
}
