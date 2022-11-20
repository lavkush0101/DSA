package Lecture36;

import Lecture36.DiameterOfBinaryTree.TreeNode;

public class OptimizeDiameter {
	
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
	    public int diameterOfBinaryTree(TreeNode root) {
	    	return diapair(root).d;
	    	
	    }
	    
	    public DiaPair diapair(TreeNode root) {
	    	if(root ==null) {
	    		return new DiaPair();
	    	}
	    	DiaPair ldp=diapair(root.left);
	    	DiaPair rdp=diapair(root.right);
	    	DiaPair sdp=new DiaPair();
	    	sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
	    	int d=ldp.ht+rdp.ht+2;
	    	sdp.d=Math.max(ldp.d, Math.max(rdp.d, d));
	    	return sdp;
	    	
	    	
	    }
	}
	
	public class DiaPair {
		int ht=-1;
		int d=0;
	}

}
