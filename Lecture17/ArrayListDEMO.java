package Lecture17;

import java.util.ArrayList;

public class ArrayListDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list= new ArrayList<>();
		list.add(6);
		list.add(4);
		list.add(10);
		list.add(7);
		System.out.println(list);
		
		// add at any index
		
		list.add(1,-7);
		System.out.println(list);
		
		// size of the data
		System.out.println(list.size());
		
		// remove 
		System.out.println(list.remove(2));
		System.out.println(list);
		
		//get
		System.out.println(list.get(2));
		
		//print
		
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)+"");
			
		}
		
		
		// for each 
		
		for(int v:list) {
			System.out.print(+v+"...");
		}
		System.out.println();
		// set 
		
		list.set(1, -90);
		System.out.println(list);
		
		// array
		int [] arr = new int[6];
		for(int k:arr) {
			System.out.print(arr[k]+"  ... ");
		}
		
	}

}
