package Class6;

public class class3 {

	public static int sums(int n) {
		if (n == 1)
			return 1;
		else
			return n + sums(n - 1);
	}
	
	public static void main(String[] args) {
		int a = sums(10);
		System.out.println("Sums = " + a);
		
	}

}
