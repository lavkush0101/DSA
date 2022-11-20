package Lecture41;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> list;
	
	public void add(int item) {
		list.add(item);
		upheadpify(list.size()-1);
	}

	private void upheadpify(int ci) {
		int pi=(ci-1)/2;
		if(list.get(ci)>list.get(pi)) {
			swap(ci,pi);
			upheadpify(pi);
		}
	}
	
	private void swap(int i,int j) {
		int ith=list.get(i);
		int jth=list.get(j);
		list.set(i, jth);
		list.set(j, ith);
	}

	public int remove() {
		swap(0,)
	}
}

