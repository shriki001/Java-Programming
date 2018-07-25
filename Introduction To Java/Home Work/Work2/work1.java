package Work2;

public class work1 {

	public static void main(String[] args) {
		while (true) {
			int x = MyConsole
					.readInt("enter your choice 0 for exit 1 for calculation: ");
			if (x != 1) {
				System.out.println("bay bay");
				break;
			}

			double a = MyConsole.readDouble("enter number: ");
			double b = MyConsole.readDouble("enter number: ");
			double c = MyConsole.readDouble("enter number: ");
			System.out.println(a + "x^2" + "+" + b + "x" + "+" + c + "=" + "0");
			double x1 = 0, x2 = 0;
			if (a == 0 && b == 0 && c == 0)
				System.out.println("trivial!");
			else if (a == 0 && b == 0)
				System.out.println("Error, no answer!");
			else if (a == 0) {
				x1 = ((-c) / b);
				System.out.println("x1=x2=" + x1);
			} else if ((b * b - 4 * a * c) < 0)
				System.out.println("Error, no real roots!");

			else {
				x1 = ((-b) + (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
				x2 = ((-b) - (Math.sqrt(b * b - 4 * a * c))) / (2 * a);

				if (x1 == x2)
					System.out.println("x1=x2=" + x1 + "\n");
				else
					System.out.println("x1=" + x1 + " " + "x2=" + x2 + "\n");
			}

		}
	}
}
