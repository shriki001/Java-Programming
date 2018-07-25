package Class7;

import java.util.LinkedList;

public class Hash {

	private LinkedList<Integer>[] a;
	private double r;

	public Hash(int capacity) {
		a = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++)
			a[i] = new LinkedList<Integer>();
		r = Math.random();
	}

	public void add(int x) {
		int h = hash(x);
		a[h].add(x);
	}

	public boolean search(int x) {
		int h = hash(x);
		return a[h].contains(x);
	}

	public void remove(int x) {
		int h = hash(x);
		a[h].remove(x);
	}

	private int hash(int x) {
		return (int) (x * r * a.length) % a.length;
	}

}
