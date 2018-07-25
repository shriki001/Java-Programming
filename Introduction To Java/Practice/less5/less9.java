package less5;

public class less9 {
	public static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++)

			System.out.print(a[i] + " ");

		System.out.println();
	}

	public static void EvenOdd(int[] a) {

		int start = 0, fin = a.length;
		for (int i = start; i < fin; i++) {
			if (a[i] % 2 != 0) {
				swap(a, i, fin - 1);
				fin = fin - 1;
				i = i - 1;
			}
		}
	}
	public static void swap(int[] a, int i, int j) {

		int t = a[i];
		a[i] = a[j];
		a[j] = t;

	}


	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		printArray(arr);
		EvenOdd(arr);
		printArray(arr);
	}

}
