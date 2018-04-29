package leetcode;

public class ValidBinarySearchTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	 }
	public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return isValidGrand(root.left, root.val, 0) && isValidGrand(root.left,root.val , 1) && isValidGrand(root.right, root.val, 2) && isValidGrand(root.right, root.val, 3);
    }
	private boolean isValidGrand(TreeNode root, int father, int flag) {
		if(root == null) return true;
		if(flag == 0) {
			if(root.val >= father) return false;
			if(root.left == null) return true;
			if(root.left.val < root.val) return true;
			return false;
		}else if(flag == 1) {
			if(root.val >= father) return false;
			if(root.right == null) return true;
			if(root.right.val > root.val && root.right.val < father) return true;
			return false;
		}else if (flag == 2) {
			if(root.val <= father) return false;
			if (root.left == null) return true;
			if(root.left.val < root.val && root.left.val > father) return true;
			return false;
		}else if(flag == 3) {
			if(root.val <= father) return false;
			if(root.right == null) return true;
			if(root.right.val > root.val) return true;
			return false;
		}
		return false;
	}
}
