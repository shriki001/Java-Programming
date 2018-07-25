package Class8;

public class Median {

	public static int k_select(int k, int[] a) {
		int pivot = (int) (Math.random() * a.length);
		int small = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] < a[pivot])
				small++;
		if (k == small)
			return a[pivot];
		else if (k < small) {
			int[] b = new int[small];
			int p = 0;
			for (int i = 0; i < a.length; i++)
				if (a[i] < a[pivot])
					b[p++] = a[i];
			return k_select(k, b);
		} else {
			int[] b = new int[a.length - small - 1];
			int p = 0;
			for (int i = 0; i < a.length; i++)
				if (i != pivot && a[i] >= a[pivot])
					b[p++] = a[i];
			return k_select(k - small - 1, b);
		}

	}

	public static void main(String[] args) {
		int[] test2 = { 10, 7, 2, 12, 5, 38, 17, 14, 9, 16, 21, 3, 15 };
		int n = 100000000;
		int[] test = new int[n];
		for (int i = 0; i < test.length; i++)
			test[i] = (int) (Math.random() * test.length);
		System.out.println(k_select(n / 2, test));
		System.out.println(k_select(8, test2));

	}

}
