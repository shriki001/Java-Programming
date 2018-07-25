package Class3;

public class class2 {
	public static boolean odd(int x) {
		if (x % 2 == 0)
			return false;
		return true;
	}

	public static int max(int x, int y) {
		if (x < y)
			return y;
		return x;
	}

	public static int factorial(int x) {
		int at = 1;
		for (int i = 1; i <= x; i++) {
			at = at * i;
		}
		return at;
	}

	public static void main(String[] args) {
		boolean a = odd(8);
		System.out.println(a + "\n");
		int b = max(7,130);
		System.out.println(b + "\n");
		int c = factorial(5);
		System.out.println(c + "\n");

	}
}