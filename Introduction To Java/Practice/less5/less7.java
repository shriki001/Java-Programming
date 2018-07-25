package less5;

public class less7 {
	public static int power(int base, int degree) {
		if (degree <= 0)
			return 1;
		int power = 1;
		for (int i = 1; i <= degree; i++) {

			power = power * base;

		}
		return power;
	}

	public static void main(String[] args) {
		int a = power(2, 4);
		System.out.println(a);
	}

}
