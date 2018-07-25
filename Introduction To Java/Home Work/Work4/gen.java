package Work4;

public class gen {
	public static void main(String[] args) {
		int x = 8, y = 5;
		System.out.println("x=:" + x + " " + "y=:" + y);
		if (x > y) {
			y = x + y;
			x = y - x;
			y = y - x;
			System.out.println("x=:" + x + " " + "y=:" + y);
		} else if (y > x) {
			x = y + x;
			y = x - y;
			x = x - y;
			System.out.println("x=:" + x + " " + "y=:" + y);
		}
		else
			System.out.println("x=:" + x + " " + "y=:" + y);

		int a = 5, b = 8, c = 0;
		System.out.println("a=:" + a + " " + "b=:" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("a=:" + a + " " + "b=:" + b);
		System.out.println(" ");
		int z[][] = new int[5][5];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z.length; j++)
				z[i][j] = (int) (10 * Math.random());
		}
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}

	}
}