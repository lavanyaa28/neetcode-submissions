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
    public TreeNode invertTree(TreeNode root) {

        inversion(root);
        return root;

        
    }

    public void inversion(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        if(root.left== null && root.right==null)
        {
            return;
        }

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        if(root.left!=null)
        {
            inversion(root.left);
        }
        if(root.right!=null)
        {
            inversion(root.right);
        }

        return;
    }
}
