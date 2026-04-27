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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> al = new ArrayList<>();
        if(root == null)
        {
            return al;
        }

        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        int curr=0;

        while(!q.isEmpty())
        {
            al.add(new ArrayList<>());
            int len = q.size();

            for(int i=0;i<len;i++)
            {
                TreeNode currNode= q.poll();
                al.get(curr).add(currNode.val);
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }

                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
            curr++;
        } 

        return al;
        
    }
}
