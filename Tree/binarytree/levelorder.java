package Tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.openmbean.ArrayType;
import javax.swing.tree.TreeNode;


public class levelorder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        List<List<Integer>> results = new ArrayList<>();

        if(root == null){
            return results;
        }

        q1.offer(root);

        while(q1.size() > 0){
            int levelsize = q1.size();
            List<Integer> onelevel = new ArrayList<>();

            for(int i = 0; i < levelsize; ++i){
                TreeNode temp = q1.peek();
                onelevel.add(temp.val);
                if(temp.left != null){
                    q1.offer(temp.left);
                }
                if(temp.right != null){
                    q1.offer(temp.right);
                }
                q1.poll();
            }
            results.add(onelevel);

        }

        return results;
    }
}
