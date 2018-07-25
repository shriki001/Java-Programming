package Bonus;

public class Bonus {
	public static void niven() {
		int sum = 0;
		for (int i = 100; i <= 999; i++) {
			sum = i % 10 + i / 100 + i / 10 % 10;
			if (i % sum == 0)
				System.out.print(" " + i);
		}
	}

	public static boolean isInt(String s) {
		boolean p = false;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
				p = true;
			else {
				p = false;
				return p;
			}
		return p;
	}

	public static int toInt(String s) {

		int sum = 0;
		int b = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			sum = b * (s.charAt(i) - 48) + sum;
			b = b * 10;
		}

		return sum;
	}

	public static int Seq(int[] arr) {
		int max = 1;
		int max2 = max;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				max++;
			else
				max = 1;
			if (max > max2)
				max2 = max;

		}

		return max2;
	}

	public static void main(String[] args) {
		System.out.print("1: ");
		niven();
		System.out.println(" ");
		boolean p = isInt("774e857");
		System.out.println("2: " + p);
		String a = "132";
		System.out.println("3: " + toInt(a));
		int[] arr1 = { -1, -1, 8, 3, 3, 3, 3, -5, -5, -5 };
		System.out.println("4: " + Seq(arr1));

	}

}
