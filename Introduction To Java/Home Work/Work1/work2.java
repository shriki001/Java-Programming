package Work1;

public class work2 {
	public static void main(String[] args) {
		System.out.println("To change from C to F perss 1");
		System.out.println("To change from F to C perss 2");
		int x = MyConsole.readInt("Enter your choice: ");
		int sum1 = 0, sum2 = 0;
		if (x == 1) {
			int c = MyConsole.readInt("Enter Celsius degrees: ");
			sum1 = (c * 9 / 5) + 32;
			System.out.println("F°= " +  sum1);
		} else if (x == 2) {
			int f = MyConsole.readInt("Enter Fahrenheit degrees: ");
			sum2 = (f - 32) * 5 / 9;
			System.out.println("C°= " +  sum2);
		} else
			System.out.println("You not entered true choice");
	}

}
