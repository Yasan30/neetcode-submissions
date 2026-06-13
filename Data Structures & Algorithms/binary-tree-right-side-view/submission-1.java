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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<Integer>();
        if(root==null){
            return li;
        }
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            
            while(!q.isEmpty()){
                int ans=0;
                int size=q.size();
                for(int i=0;i<size;i++){
                    TreeNode curr = q.poll();
                    if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                ans=curr.val;
                }
                li.add(ans);
            }
       return li; 
    }
}
