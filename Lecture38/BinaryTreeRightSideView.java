package Lecture38;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

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
	 int depth=0;
	 public List<Integer> rightSideView(TreeNode root) {
		 List<Integer> list=new ArrayList<>();
	      TreeView(root,0,list);
	      return list;
		 
	 }
	 public void  TreeView(TreeNode root,int currLev,List<Integer> list) {
		 if(root==null){
             return;
         }
		 if(currLev >depth ) {
			 list.add(root.val);
//			 System.out.println(root.val+" ");
			 depth= currLev;
		 }
		 TreeView(root.right, currLev+1,list);
		 TreeView(root.left, currLev+1,list);
		
	 	}
	 }
}
