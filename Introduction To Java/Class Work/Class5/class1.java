package Class5;

import java.util.Arrays;

public class class1 {

	public static void main(String[] args) {
		int n = 10;
		int[] test = new int[n];
		for (int i = 0; i < test.length; i++) {
			test[i] = (int) (2 * test.length * Math.random());
		}

		long start_time = System.currentTimeMillis();
		selection_sort(test);
		long end_time = System.currentTimeMillis();

		System.out.println("selection sort: " + (end_time - start_time));
	}

	public static void selection_sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int j = min(a, i);
			swap(a, i, j);
			System.out.println(Arrays.toString(a));
		}
	}

	public static int min(int[] a, int start) {
		int p = start;
		for (int i = start; i < a.length; i++) {
			if (a[i] < a[p])
				p = i;
		}
		return p;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
