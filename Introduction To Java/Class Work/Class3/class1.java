package Class3;

public class class1 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		boolean p = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = (int) (11 * Math.random() - 5);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < 0)
					p = true;

			}

		}
		if (p == true)
			System.out.println(p);
	}
}