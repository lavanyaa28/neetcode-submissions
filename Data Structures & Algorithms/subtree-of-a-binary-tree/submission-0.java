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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // 1st step : find the node where the val equals the value of subroot
        //2nd step: check the left and right nodes
        // 3rd step : if the supertree extends beyond the value of the subtree -- return false

        if(root == null)
        {
            return false;
        }

        if(root.val == subRoot.val)
        {
            if(isIdentical(root, subRoot))
            {
                return true;
            }
        }

        return isSubtree(root.left , subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode root, TreeNode subRoot)
    {
        if(root == null && subRoot == null )
        {
            return true;
        }

        if(root == null || subRoot == null)
        {
            return false;
        }

        if(root.val != subRoot.val)
        {
            return false;
        }
        if(!isIdentical(root.left,subRoot.left) || !isIdentical(root.right,subRoot.right))
        {
            return false;
        }
        return true;       
    }

}
