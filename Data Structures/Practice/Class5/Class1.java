package Class5;

import java.util.Arrays;

public class Class1 {

	public static int[] sort(int[] a) {
		int[] temp = new int[a.length];
		for (int i = 0, k = 0, j = a.length - 1; k < a.length; k++) {
			if (a[k] % 2 == 0)
				temp[i++] = a[k];
			else
				temp[j--] = a[k];
		}
		return temp;

	}

	public static void main(String[] args) {
		int[] a = { -3, 6, 12, 4, -7, 45, -6, -3, -1, 2, 3, 10, 1, 2, 3, 4, 5 };
		System.out.println("Before: " + Arrays.toString(a));
		System.out.println("After: " + Arrays.toString(sort(a)));

	}

}
