package Lecture36;

import Lecture36.DiameterOfBinaryTree.TreeNode;

public class BalancedBinaryTree {

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.val = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	    }
	}
	
	class Solution {
	    public boolean isBalanced(TreeNode root) {
	        boolean l=isBalanced(root.left);
	        boolean r=isBalanced(root.right);
	        
	        boolean s=Math.abs(ht(root.left))-
	        
	    }
	    
	    private int ht(TreeNode node) {
			// TODO Auto-generated method stub
			if (node == null) {
				return -1;
			}
			int lh = ht(node.left);
			int rh = ht(node.right);
			return Math.max(lh, rh) + 1;
		}
	}
}
