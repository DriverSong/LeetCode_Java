package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InvertBinaryTree {

//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	  public TreeNode invertTree(TreeNode root) {
		  if (root == null) {
			return null;
		}
		  List<TreeNode> treeNodes = inOrder(root);
		  for(TreeNode node : treeNodes) {
			  if (node.left == null && node.right == null) {
				continue;
			}else if (node.left != null && node.right == null) {
				node.right = node.left;
				node.left = null;
			}else if (node.left == null && node.right != null) {
				node.left = node.right;
				node.right = null;
			}else {
				TreeNode temp = node.left;
				node.left = node.right;
				node.right = temp;
			}
		  }
		  return root;
	  }
	private ArrayList<TreeNode> inOrder(TreeNode root) {
		ArrayList<TreeNode> treeNodes = new ArrayList<>();
		if (root == null) {
			return treeNodes;
		}
		treeNodes.addAll(inOrder(root.left));
		treeNodes.add(root);
		treeNodes.addAll(inOrder(root.right));
		return treeNodes;
	}
}
