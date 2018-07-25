package Class4;

public class class1 {

	public static boolean isDigit(char c) {
		if (c >= 48 && c <= 57)
			return true;
		return false;
	}

	public static boolean isLetter(char a) {
		if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))
			return true;
		return false;
	}

	public static char toLowerCase(char b) {
		if (b >= 65 && b <= 90)
			b += 32;
		return b;
	}
	public static char toUpperCase(char d) {
		if (d >= 90 && d <= 122)
			d -= 32;
		return d;
	}

	public static void main(String[] args) {
		boolean c = isDigit('9');
		System.out.println("1="+c);
		boolean a = isLetter('b');
		System.out.println("2="+a);
		char b = toLowerCase('H');
		System.out.println("3="+b);
		char d = toUpperCase('m');
		System.out.println("4="+d);
	}

}
