package Work1;

public class work1 {
	public static void main(String[] args) {
		int num1 = MyConsole.readInt("enter number: ");
		int num2 = MyConsole.readInt("enter number: ");
		int num3 = MyConsole.readInt("enter number: ");
		if (num1 != 0) {
			System.out.println("the equation is: " + num1 + "x" + "+" + num2
					+ "=" + num3);
			System.out.println("x=" + (double) (num3 - num2) / num1);
		} else
			System.out.println("a can't be 0");

	}

}
