package less3;

import java.util.Scanner;

public class less4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("enter Prime number: ");
		int n = console.nextInt();
		boolean p = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				p = false;
			}
		}
		System.out.println(p);

		console.close();

	}
}
