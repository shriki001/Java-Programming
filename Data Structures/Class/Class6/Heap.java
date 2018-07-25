package Class6;

public class Heap {

	private int[] a;
	private int size = 0;

	public Heap(int capacity) {
		a = new int[capacity];
	}

	public void changeArray(int[] b, int newSize) {
		a = b;
		size = newSize;
		for (int i = newSize; i >= 1; i--) {
			swapDown(i);
		}
	}

	public boolean add(int data) {
		if (size >= a.length - 1)
			return false;
		else {
			int i = ++size;
			a[i] = data;
			swapUp(i);
			return true;
		}
	}

	public int remove() {
		if (size == 0)
			return Integer.MAX_VALUE;
		int answer = a[1];
		a[1] = a[size--];
		swapDown(1);

		return answer;
	}

	private void swapDown(int i) {
		int left = 2 * i;
		int right = 2 * i + 1;

		if (left <= size) {
			int max = left;
			if (right <= size && a[right] > a[left])
				max = right;
			if (a[i] < a[max]) {
				swap(i, max);
				swapDown(max);
			}
		}

	}

	private void swapUp(int i) {
		if (i != 1) {
			int parent = i / 2;
			if (a[parent] < a[i]) {
				swap(parent, i);
				swapUp(parent);
			}
		}
	}

	private void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
