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

      public void leftDFS(TreeNode node,int level, List<Integer> res){
        if (node == null) return;
        if (res.size() == level)
            res.add(node.val);
        leftDFS(node.left,level+1,res);
        leftDFS(node.right,level+1,res);
    }
    public void rightDFS(TreeNode node, int level, List<Integer> res){
        if (node == null) return;
        if (res.size()== level)
            res.add(node.val);
        rightDFS(node.right,level+ 1,res);
        rightDFS(node.left,level+ 1,res);
    }
    public List<Integer> leftView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        leftDFS(root,0,res);
        return res;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        rightDFS(root,0,res);
        return res;
    }
}