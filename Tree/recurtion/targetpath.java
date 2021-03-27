package Tree.recurtion;

import Tree.binarytree.TreeNode;

public class targetpath {
    // private boolean haspath = false;
    // public boolean hasPathSum(TreeNode root, int targetSum) {
    //     if(root == null){
    //         return false;
    //     }
    //     dfs(root, targetSum, 0);
    //     return haspath;
    // }
    
    // public void dfs(TreeNode root, int targetSum, int currentsum){
    //     if(haspath == true){
    //         return;
    //     }
    //     if(root == null){
    //         return;
    //     }
    //     currentsum += root.val;
    //     if(root.left == null && root.right == null){
    //         if(currentsum == targetSum){
    //             haspath = true;
    //         }
    //         return;
    //     }

    //     dfs(root.left, targetSum, currentsum);
    //     dfs(root.right, targetSum, currentsum);
    // }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
