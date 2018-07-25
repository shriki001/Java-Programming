package Class2;

public class MyQueue {
	
	private int[] a;
	private int size, start=0;
	final int DEFAULT_SIZE=5;
	
	public MyQueue(){
		a= new int[DEFAULT_SIZE];
	}
	
	public MyQueue(int capacity){
		a=new int[capacity];
	}

	public boolean offer(int b){
		if(size== a.length)
			return false;
		else{
			int p=(start+size)% a.length;
			a[p]=b;
			size++;
			return true;
		}
	}
		public int poll(){
			if(size==0)
				return Integer.MAX_VALUE;
			else{
				int ans= a[start];
				start= (start+1)%a.length;
				size--;
				return ans;
			}
		}
		
		public int size() {
			return size;
		}

		public int capacity() {
			return a.length;
		}
	
}
