package Class1;
import java.util.Arrays;

public class Merge_sort {// the best O(n*log(n)) sort

	public static void merge_sort(int[] a) {
		merge_sort(a, 0, a.length - 1);
	}

	public static void merge_sort(int[] a, int F, int L) {
		if (L > F) {
			int m = (F + L) / 2;
			merge_sort(a, F, m);
			merge_sort(a, m + 1, L);
			merge(a, F, m, L);
		}

	}

	private static void merge(int[] a, int F, int M, int L) {
		int[] temp = new int[L - F + 1];
		int i = F, j = M + 1, k = 0;
		while (i <= M && j <= L) {
			if (a[i] < a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}
		while (i <= M)
			temp[k++] = a[i++];
		while (j <= L)
			temp[k++] = a[j++];

		for (int m = 0; m < temp.length; m++)
			a[F + m] = temp[m];
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 2, 4, 6, 8 };
		System.out.println(Arrays.toString(a));
		merge(a, 0, 3, 7);
		System.out.println(Arrays.toString(a));

		System.out.println();

		int b[] = { 10, 5, 8, 3, 2, 4, 12, 1 };
		System.out.println(Arrays.toString(b));
		merge_sort(b);
		System.out.println(Arrays.toString(b));

	}

}

