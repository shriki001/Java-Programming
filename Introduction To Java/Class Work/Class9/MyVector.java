package Class9;

import java.util.Vector;

public class MyVector {
	public static void vectorExample() {
		// ווקטור של מחרוזות
		Vector<String> v = new Vector<String>();
		v.add("One");// הוספת איבר חדש לווקטור
		v.add("Two");
		v.add("Three");
		v.add("Four");
		v.add("Five");
		// הדפסת נפח של וקטור
		System.out.println("capacity " + v.capacity());
		// האם וקטור מכיל איבר מסוים
		System.out.println("contains One: " + v.contains("One"));
		System.out.println("contains one: " + v.contains("one"));
		// מהווקטור מחיקת איבר מסוים
		v.remove("One");
		// בדיקה
		// הדפסת תוכן הווקטור
		System.out.println("contains One: " + v.contains("One"));
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.elementAt(i) + ", ");
		}
		System.out.println();
		// Integer ווקטור של מספרים שלמים (אובייקטים מסוג
		System.out.println("vector of integers");
		Vector <Integer> vi = new Vector <Integer>();
		System.out.println("is empty " + vi.isEmpty());
		vi.add(1);
		vi.add(-3);
		vi.add(5);
		vi.add(-9);
		for (int i = 0; i < vi.size(); i++) {
			System.out.print(vi.elementAt(i) + ", ");
		}
		System.out.println();
		// האם וקטור ריק?
		System.out.println("is empty " + vi.isEmpty());
		// מיקום של איבר
		System.out.println("index of 1 " + vi.indexOf(1));
		System.out.println("index of -3 " + vi.indexOf(-3));
		System.out.println("index of 2 " + vi.indexOf(2));
		// מחיקה
		vi.remove((Integer) 1);
		vi.remove(1);
		for (int i = 0; i < vi.size(); i++) {
			System.out.print(vi.elementAt(i) + ", ");
		}
	}

	public static void main(String[] args) {
		vectorExample();
	}
}
