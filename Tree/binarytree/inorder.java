package Tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

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

public class inorder {
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> nodes = new ArrayList<> ();
    //     inorder(root, nodes);
    //     return nodes;
    // }
    // public void inorder(TreeNode root, List<Integer> nodes){
    //     if(root == null){
    //         return;
    //     }
    //     inorder(root.left, nodes);
    //     nodes.add(root.val);
    //     inorder(root.right, nodes);
    // }

    //栈+tree
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<> ();
        Stack<TreeNode> nodes = new Stack<>();

        TreeNode begin = root;

        while(begin != null || nodes.isEmpty() == false){
            while(begin != null){
                nodes.push(begin);
                begin = begin.left;
            }
            results.add(nodes.peek().val);
            begin = nodes.pop().right;
        }

        return results;
    }
}
