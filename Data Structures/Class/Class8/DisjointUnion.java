package Class8;

import java.util.Arrays;

public class DisjointUnion {

	int[] a, size;

	public DisjointUnion(int capacity) {
		a = new int[capacity];
		size = new int[capacity];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			size[i] = 1;
		}
	}

	public void union_not_root(int x, int y) {
		union(root(x), root(y));
	}

	public void union(int x, int y) {
		if (x == a[x] && y == a[y]) {
			if (size[x] >= size[y]) {
				a[y] = x;
				size[x] = size[x] + size[y];
			} else {
				a[x] = y;
				size[y] = size[x] + size[y];
				size[x] = 0;
			}
		}
	}

	public boolean find(int x, int y) {
		return root(x) == root(y);
	}

	public int root(int x) {
		int answer = x;
		while (a[answer] != answer)
			answer = a[answer];
		return answer;
	}

	public static void main(String[] args) {
		DisjointUnion dj = new DisjointUnion(10);
		System.out.println(dj);
		dj.union(1, 5);
		System.out.println(dj);
		dj.union(2, 6);
		System.out.println(dj);
		dj.union(1, 2);
		System.out.println(dj);
		System.out.println(dj.find(8,6));
	}
	public String toString(){
		return Arrays.toString(a);
	}
}
