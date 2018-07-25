package Class6;

public class class2 {

	public static int exp(int x, int y) {
		if (y == 0)
			return 1;
		else
			return x * exp(x,y - 1);
	}

	public static void main(String[] args) {

		int b = exp(4, 4);
		System.out.println("Exponation = " + b);
	}

}
