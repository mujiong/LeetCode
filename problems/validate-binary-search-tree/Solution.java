/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if (!isValidBST(root.left)) {
            return false;
        }
        if (prev != null && prev.val >= root.val)
            return false;
        prev = root;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }
}