package Class4;

/*
 1)����� ���� �� �� �� ������� �������
 2)����� ���� �� �� �� ����� ���� �� �� ������� � ��� �� ��� ����� ��� ���
 3)����� ���� �� �� �� �2 ������� �� ����� �� ���� ������ ����� ���� ����
 */
public class class2 {
	public static boolean palindrome(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++)
			t = s.charAt(i) + t;
		if (s.equals(t))
			return true;
		return false;

	}

	public static boolean pangram(String s) {
		boolean b = true;
		for (int i = 0; i < s.length(); i++)
			for (char j = 'a'; j <= 'z'; j++)
				if (s.contains("" + j))
					b = true;
				else {
					b = false;
					return b;
				}
		return b;
	}

	public static boolean permutation(String s, String t) {
		for (int i = 0; i < s.length(); i++)
			//for (int j = 0; i < t.length(); j++)
				if (s.contains(t)&&t.contains(s))
		return true;
				
		return false;
	}

	public static void main(String[] args) {
		boolean a = palindrome("asder");
		System.out.println("1: "+a);
		boolean b = pangram("abcdefghijklmnopqrstuvwxyz");
		System.out.println("2: "+b);
		boolean c = permutation("asder","asder");
		System.out.println("3: "+c);
	}
}