package Work3;

public class TestPHI {
	public static int FindGCD(int a, int b) {
		if (b == 0) return a;
        else return FindGCD(b, a % b);
	}

	public static int phi(int n) {
		int count = 1;
		for (int i = 2; i < n; i++)
			if (FindGCD(n, i) == 1)
				count++;
		return count;
	}

	/*public static void main(String[] args) {
		int num = phi(5);
		System.out.println(num);

	}*/

}
