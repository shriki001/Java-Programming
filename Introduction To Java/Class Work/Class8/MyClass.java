package Class8;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String secret = args[0];
		String g = "";
		int c = 0;

		while (c != secret.length()) {
			System.out.println("Enter Your Guess: ");
			String a = s.next();
			char b = a.charAt(0);
			g = g + b;

			for (int i = 0; i < secret.length(); i++) {
				if (!g.contains("" + secret.charAt(i)))
					System.out.print("_ ");
				else {
					System.out.print(secret.charAt(i));

				}
			}

			System.out.println();
			c++;

		}
		s.close();
	}
}
