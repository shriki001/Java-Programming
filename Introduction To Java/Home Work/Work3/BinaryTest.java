package Work3;

public class BinaryTest {
	public static int Binary2Int(String b) {
		int sum = b.length();
		int x = 1, count = 0;
		int a[] = new int[sum];
		for (int i = sum - 1; i >= 0; i--) {
			if (b.charAt(i) == 48)
				a[i] = 0 * x;
			else
				a[i] = 1 * x;
			x *= 2;
			count += a[i];
		}
		return count;

	}

	public static String Int2Binary(int n) {

		String a = "";
		String b = "";
		if (n == 0)
			a = "1";
		while (n != 0) {
			if (n % 2 != 0)
				a = a + "1";
			else
				a = a + "0";
			n = n / 2;
		}
		for (int i = 0; i < a.length(); i++)
			b = a.charAt(i) + b;
		return b;

	}

	public static boolean isBinaryString(String b) {
		boolean p = true;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) != 48 && b.charAt(i) != 49) {
				p = false;
				return p;
			}
		}
		return p;

	}

	
	/* public static void main(String[] args) { 
		 int a = Binary2Int("1010101");
		 System.out.println(a);
		 boolean k = isBinaryString("2");
		 System.out.println(k); 
		 String b=Int2Binary(22); 
		 System.out.println(b); 
		 }
	 */
}