package leetcode;

public class SymmetricTree {
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
    public boolean isSymmetric(TreeNode root) {
    	if ( root == null) 
			return true;
        return isReverse(root.left, root.right);
    }
	private Boolean isReverse(TreeNode root1, TreeNode root2) {
		if(root1 == null || root2 == null) return root1==root2;
		return (root1.val == root2.val) && isReverse(root1.left, root2.right)&&isReverse(root1.right, root2.left);
	}
}
