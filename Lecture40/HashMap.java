package Lecture40;

import java.util.ArrayList;

public class HashMap {
	
	public class Node{
		String key;
		int value;
		Node next;
	}
	
	//
	private ArrayList<Node> bucketArr;
	private int size=0;
	
	// as per size store the null value by default 
	public HashMap(int cap) {
		this.bucketArr=new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			this.bucketArr.add(null);
		}
	}
	//
	public HashMap() {
		this(4);
	}
	
	public void put(String key,int value) {
		int bn=hashfun(key);
		Node temp=this.bucketArr.get(bn);
		while(temp!=null) {
			if(temp.key.equals(temp)) {
				temp.value=value;
				return ;
			}
			temp=temp.next;
		}
		Node nn=new Node();
		nn.key=key;
		nn.value=value;
		temp=this.bucketArr.get(bn);
		nn.next=temp;
		this.size++;
		this.bucketArr.set(bn, nn);
		double thf=2.0;
		double lf=(1.0*this.size)/this.bucketArr.size();
		if(lf>thf) {
			reHashing();
		}
	}
		
		private  void reHashing() {

			ArrayList<Node> nba =new ArrayList<>();
			for (int i = 0; i < 2*bucketArr.size(); i++) {
				nba.add(null);
			}
			ArrayList<Node> oba=bucketArr;
			bucketArr=nba;
			this.size=0;
			for(Node nn:oba) {
				while(nn!=null) {
					put(nn.key,nn.value);
					nn=nn.next;
				}
			}
		}
		
		
		
		// 
		@Override
		public String toString() {
			String s="{";
			for(Node nn:bucketArr) {
				while(nn!=null) {
					s=s+nn.key+" = "+nn.value + " , ";
					nn=nn.next;
				}
			}
			s=s+"}";
			return s;
		}
	
	
	// check the key available are not in hash map
	public boolean containKey(String key,int value) {
		int bn=hashfun(key);
		Node temp=this.bucketArr.get(bn);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	
	}
	// get the value of hashmap 
	
	public Integer get(String key,int value) {
		int bn=hashfun(key);
		Node temp=this.bucketArr.get(bn);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	
	}
	
	// remove 
	public Integer remove(String key) {
		int bn=hashfun(key);
		Node curr=this.bucketArr.get(bn);
		Node prev=null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
				
			}
			prev =curr;
			curr=curr.next;
		}
		if(curr==null) {
			return null;
		}else if(prev==null) {
			bucketArr.set(bn, curr.next);
		}else {
			prev.next=curr.next;
			curr.next=null;
		}
		
		this.size--;
		return curr.value;

	
	}
	
	
	
	
	
	
	
	
	
	
	
	// hashCode har object k according unique value hota hai
	//hash code ek integer value return krta hai
	
	public int hashfun(String key) {
		int bn=key.hashCode()%this.bucketArr.size();
		if(bn<0) {
			bn=bn+this.bucketArr.size();
		}
		return bn;
		
	}
	
	
	
	

}
