package Tree.recurtion;
import java.util.Deque;
import java.util.LinkedList;

import Tree.binarytree.TreeNode;
public class symmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return ismirro(root.left, root.right);
    }
    public boolean ismirro(TreeNode left, TreeNode right){
        if(left != null && right != null){
            return ismirro(left.left, right.right) && ismirro(left.right, right.left) && (left.val == right.val);
        }
        if(left == null && right == null){
            return true;
        }
        return false;
    }
}
