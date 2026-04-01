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
    Stack<Integer> st = new Stack<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return st;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        st.add(root.val);
        
        return st;
    }
}