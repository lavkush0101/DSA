package Lecture32;

public class DyamicQueue extends Queue{
	
	
	@Override
	public void Enqueue(int item) throws Exception {

		if (isFull()) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < size; i++) {
				int idx = (this.front + i) % this.data.length;
				arr[i] = data[idx];
			}
			this.front = 0;
			data=arr;
		}

		super.Enqueue(item);
	}
	
	
	public static void main(String[] args) throws Exception {
		DyamicQueue  d= new DyamicQueue();
		d.Enqueue(12);
		d.Enqueue(13);
		d.Enqueue(14);
		d.Enqueue(15);
		d.Enqueue(16);
		d.Enqueue(17);
		d.Enqueue(18);
		d.Enqueue(19);
//		d.Dequeue(12);
		d.display();
      		

	}

}
