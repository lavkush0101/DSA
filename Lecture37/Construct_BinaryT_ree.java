package Lecture37;

import java.util.Iterator;

public class Construct_BinaryT_ree {
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
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
	     
		 
	 }
	 
	public TreeNode CreateTree(int []pre,int [] in,int ilo,int ihi,int plo,int phi) {
				if()
		
			TreeNode nn= new TreeNode(pre[plo]);
			int i=search(in, ilo, ihi, pre[plo]);
			int net=i-ilo;
			nn.left=CreateTree(pre, in, ilo, i-1, plo+1, phi+net);
			nn.right=CreateTree(pre, in, i+1, ihi, plo+net+1, phi);
			return nn;
					
			
		}
		
		public int search(int []in,int ilo,int  ihi,int item) {
			for (int i = ilo; i <=ihi; i++) {
				if(in[i]==item) {
					return i;
				}
			}
			return 0;
		}
	}
}
