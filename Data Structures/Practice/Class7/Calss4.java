package Class7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Calss4 {

	public static boolean palindrom(String str) {

		Stack<String> a = new Stack<String>();
		Queue<String> b = new LinkedList<String>();

		String s = "";

		for (int i = 0; i < str.length(); ) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9'){
				s = s + ch;
				i++;}
			else 
				i++;
		}
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			s2 = ""+ s.charAt(i);
			a.push(s2);
			b.add(s2);
		}

		while (!b.isEmpty()) 
			if (b.remove().compareToIgnoreCase(a.pop()) != 0)
				return false;
	
		return true;

	}

	public static void main(String[] args) {
		String a = "abcfba";
		String b = "Are we not pure? “No sir!” Panama’s moody Noriega brags. "
				+ "“It is garbage!” Irony dooms a man; a prisoner up to new era.";
		String c = "1234567321";
		
		System.out.println(palindrom(a));
		System.out.println(palindrom(b));
		System.out.println(palindrom(c));

	}

}
