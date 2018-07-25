package Class6;

public class class1 {

	public static int fac(int n) {
		if (n == 1)
			return 1;
		else
			return n * fac(n - 1);
	}

	public static int exp(int x) {
		if (x == 0)
			return 1;
		else
			return 2 * exp(x - 1);
	}

	public static double H(int x) {
		if (x == 1)
			return 1;
		else
			return H(x - 1) + 1.0 / x;
	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		else {
			int dif = b%a;
			if (a < b)
				return gcd(a, dif);
			else
				return gcd(dif, a);
		}
	}

	public static void main(String[] args) {
		int a = fac(5);
		System.out.println("Factorial = " + a);
		int b = exp(5);
		System.out.println("Exponation = " + b);
		double c = H(2);
		System.out.println("Harmonic = " + c);
		int d = gcd(6,24);
		System.out.println("gcd = " + d);
	}

}
