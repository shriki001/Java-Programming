package Class2;

public class MyStack<T> {
	private int size;
	private T[] a;
	final int DEFAULT_SIZE = 5;

	public MyStack() {
		a = (T[])new Object[DEFAULT_SIZE];
	}

	public MyStack(int capacity) {
		a = (T[]) new Object[capacity];
	}

	public boolean push(T b)  {
		if (size == a.length)
			return false;
		else {
			a[size++] = b;
			return true;
		}
	}

	public T pop() {
		if (size == 0)
			return null; 
		else
			return a[--size];
	}

	public T peek() {
		if (size == 0)
			return null; 

		else
			return a[size - 1];
	}

	public void clear() {
		size = 0;
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return a.length;
	}

	public int search(T b) {
		for (int i = 0; i < size; i++) {
			if (a[i] == b)
				return i;
		}
		return -1;
	}

}
