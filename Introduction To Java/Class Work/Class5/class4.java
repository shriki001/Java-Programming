package Class5;

import java.util.Arrays;

public class class4 {
	public static int[] marge(int[] a, int b[]) {
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
				k++;
			}

			else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length)   {
				c[k] = a[i];
				i++;
				k++;
		}
		while (j < b.length)   {
			c[k] = b[j];
			j++;
			k++;
	}

		

		return c;
	}

	public static void main(String[] args) {
		int[] a = { 1, 10, 15, 20 };
		int[] b = { 2, 5, 6, 12, 13 };
		int c[] = marge(a, b);
		System.out.println(Arrays.toString(c));
	}

}
