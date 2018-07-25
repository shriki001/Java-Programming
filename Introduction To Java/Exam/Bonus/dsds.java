package Bonus;

public class dsds {
	public static boolean primecheck(int a) {
		boolean p = true;
		for (int i = 2; i < a; i++)
			if (a % i == 0)
				p = false;
		return p;
	}

	public static void prime() {
		for (int i = 100; i <= 999; i++) {
			int b = i % 10 * 100 + (i % 100 / 10) * 10 + i / 100;
			if (primecheck(i) && primecheck(b))
				System.out.print(i + ",");
		}
		
	}
	public static void main(String[] args) {
		prime();

	}

}