package less5;

public class less2 {
	public static int sumofdigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int a = sumofdigits(2546);
		System.out.println(a);
	}

}
