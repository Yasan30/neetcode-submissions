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
    int cnt=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        return dfs(root,k);
    }
        private int dfs(TreeNode node,int k){
            if(node==null){
                return 0;
            }
            dfs(node.left,k);
            cnt++;
            
        if(cnt==k){
            ans=node.val;
        }
        dfs(node.right,k);
        return ans;
    }
}
