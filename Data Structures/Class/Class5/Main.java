package Class5;

public class Main {

	public static void main(String[] args) {
		MySkipList a= new MySkipList();
		Node s= new Node(4);
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(8);
		a.add(9);
		a.add(11);
		a.add(12);
		a.add(15);
		s.setNext(s);
		

	}

}
