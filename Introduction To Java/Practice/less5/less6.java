package less5;
import java.util.Scanner;
public class less6 {
	public static int factor(int num) {
		int at=1;
		for (int i = 1; i <= num; i++) {
			at=at*i;
					}
		return at;
	}

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.print("enter number: ");
        int x = console.nextInt();
		int a = factor(x);
		System.out.println(a);
		console.close();
	}

}
