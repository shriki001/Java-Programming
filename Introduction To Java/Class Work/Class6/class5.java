package Class6;

public class class5 {

	public static boolean palindrome(String s) {
		boolean p=false;
		int j=s.length();
		for (int i = 0; i < s.length(); i++) 
			if (s.substring(i)==s.substring(j)){
			p=true;
			j--;
		}
			else p=true;
		
		return p;
	}
	
	public static void main(String[] args) {
		String a="abccba";
		System.out.println(palindrome(a));
	}

}
