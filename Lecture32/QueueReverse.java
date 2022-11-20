package Lecture32;

public class QueueReverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DyamicQueue dyamicQueue= new DyamicQueue();
		
		dyamicQueue.Enqueue(1);
		dyamicQueue.Enqueue(2);
		dyamicQueue.Enqueue(3);
		dyamicQueue.Enqueue(4);
		dyamicQueue.Enqueue(5);
		dyamicQueue.Enqueue(6);
		dyamicQueue.Enqueue(12);
		

	}

	public static void Reverse(DyamicQueue dq)throws Exception{
		if(dq.isEmpty()) {
			return;
		}
		
		
	}
}
