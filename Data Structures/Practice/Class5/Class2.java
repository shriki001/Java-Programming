package Class5;

import java.util.Arrays;

public class Class2 {

	public static void sort(int[] a) {
		
		for (int i = 0, k = i + 1; i < a.length;) {
			if (a[i] < a[k]) {
				swap(a, i, k);
				i++;
			} else if (a[i] > a[k]) {
				swap(a, k, i);
				i++;
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {

		int[] a = { 1, 6, 1, 6, 6, 1, 6, 1, 1, 6, 6 };
		System.out.println("Before: " + Arrays.toString(a));
		sort(a);
		System.out.println("After: " + Arrays.toString(a));

	}

}
