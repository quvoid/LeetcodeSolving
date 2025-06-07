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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> li = new ArrayList<>();

        Inorder(root,li);

        return li;
    }

    public static void Inorder(TreeNode node,List<Integer> li){
        
        if(node==null)
            return ;
        
        Inorder(node.left,li);
        li.add(node.val);
        Inorder(node.right,li);
    }
}