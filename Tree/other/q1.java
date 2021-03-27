package Tree.other;

import java.util.Arrays;

import Tree.binarytree.TreeNode;

public class q1 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        TreeNode root = new TreeNode(postorder[postorder.length - 1], null, null);
        int rootindex = findrootindex(root.val, inorder);
        if(rootindex > 0){
            root.left = buildTree(Arrays.copyOfRange(inorder, 0, rootindex), Arrays.copyOfRange(postorder, 0, rootindex));
        }
        if(rootindex < inorder.length - 1){
            root.right = buildTree(Arrays.copyOfRange(inorder, rootindex + 1, inorder.length), Arrays.copyOfRange(postorder, rootindex, postorder.length - 1));
        }

        return root;


        
    }
    public int findrootindex(int val, int[] inorder){
        for(int i = 0 ; i < inorder.length; ++i){
            if(val == inorder[i]){
                return i;
            }

        }
        return 0;
    }
}
