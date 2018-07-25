package Class1;

import java.util.Arrays;

public class Quick_sort {// O(n*log(n))

	public static void Quick_sort1(int[] a) {
		Quick_sort1(a, 0, a.length - 1);

	}

	private static void Quick_sort1(int[] a, int L, int H) {
		if (H > L) {
			int p = partision(a, L, H);
			Quick_sort1(a, L, p - 1);
			Quick_sort1(a, p + 1, H);
		}

	}

	public static int partision(int[] a, int L, int H) {
		int r = L + (int) ((H - L) * Math.random());
		swap(a, L, r);
		int p = L;
		L++;
		while (H >= L) {
			if (a[L] < a[p])
				L++;
			else if (a[H] >= a[p])
				H--;
			else
				swap(a, L, H);
		}
		swap(a, p, H);
		return H;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void bubble_sort(int[] a) {
		for (int j = 0; j < a.length; j++)
			for (int i = 0; i < a.length - 1 - j; i++) {
				if (a[i] > a[i + 1])
					swap(a, i, i + 1);
			}
	}

	public static void main(String[] args) {
		int n = 100000;
		int[] test = new int[n];
		int[] test2 = new int[n];
		for (int i = 0; i < test.length; i++) {
			test[i] = (int) (n * Math.random());
			test2[i] = test[i];
		}
		long start_time = System.currentTimeMillis();
		Quick_sort1(test);
		long end_time = System.currentTimeMillis();
		System.out.println("Qsort: " + (end_time - start_time));

		start_time = System.currentTimeMillis();
		bubble_sort(test);
		end_time = System.currentTimeMillis();
		System.out.println("Bsort: " + (end_time - start_time));
		System.out.println();
		int[] a = { 6, 9, 3, 11, 2, 1, 5, 4, 8, 7, 10 };
		System.out.println(Arrays.toString(a));
		start_time = System.currentTimeMillis();
		Quick_sort1(a);
		end_time = System.currentTimeMillis();
		System.out.println(Arrays.toString(a));
		System.out.println("Qsort2: " + (end_time - start_time));
	}

}
