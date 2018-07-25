package Class9;

import java.util.Vector;

public class MyVector {
	public static void vectorExample() {
		// ������ �� �������
		Vector<String> v = new Vector<String>();
		v.add("One");// ����� ���� ��� �������
		v.add("Two");
		v.add("Three");
		v.add("Four");
		v.add("Five");
		// ����� ��� �� �����
		System.out.println("capacity " + v.capacity());
		// ��� ����� ���� ���� �����
		System.out.println("contains One: " + v.contains("One"));
		System.out.println("contains one: " + v.contains("one"));
		// �������� ����� ���� �����
		v.remove("One");
		// �����
		// ����� ���� �������
		System.out.println("contains One: " + v.contains("One"));
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.elementAt(i) + ", ");
		}
		System.out.println();
		// Integer ������ �� ������ ����� (��������� ����
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
		// ��� ����� ���?
		System.out.println("is empty " + vi.isEmpty());
		// ����� �� ����
		System.out.println("index of 1 " + vi.indexOf(1));
		System.out.println("index of -3 " + vi.indexOf(-3));
		System.out.println("index of 2 " + vi.indexOf(2));
		// �����
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
