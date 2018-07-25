package Work2;

public class work2 {

	public static void main(String[] args) {

		int x = MyConsole.readInt("enter number: ");
		for (int j = 0; j <= x; j++) {
			double at = 1, at2 = 1, at3 = 1, sum = 0;
			for (int i = 1; i <= j; i++)
				at = at * i;
			for (int i = 1; i <= j + 1; i++)
				at2 = at2 * i;
			for (int i = 1; i <= j * 2; i++)
				at3 = at3 * i;
			sum = ((at3) / (at2 * at));
			System.out.print((int) sum + " ");

		}

	}

}
