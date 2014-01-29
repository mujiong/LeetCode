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
    public TreeNode sortedArrayToBST(int[] num) {
        if (num == null || num.length == 0)
            return null;
        TreeNode root = toBST(num, 0, num.length);
        return root;
    }
    
    private TreeNode toBST(int[] num, int left, int right) {
        if (left == right)
            return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = toBST(num, left, mid);
        root.right = toBST(num, mid + 1, right);
        return root;
    }
}