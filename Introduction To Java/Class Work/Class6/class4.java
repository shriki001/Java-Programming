package Class6;
public class class4 {
	public static int Fibo(int a) {
		if (a == 0)
			return 0;
		else if (a == 1)
			return 1;
		else
			return Fibo(a - 1)+Fibo(a - 2);
	}

	public static void main(String[] args) {
		int a = Fibo(6);
		System.out.println(a);
	}

}
