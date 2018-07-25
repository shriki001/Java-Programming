package Class5;

public class MySkipList {

	Node head;

	public MySkipList() {
		head = new Node(-1);
	}

	public boolean search(int d) {
		Node current = head;
		while (current != null) {
			if (d == current.getData())
				return true;
			else if (current.getNext() == null || current.getNext().getData() > d)
				current = current.getDown();
			else
				current = current.getNext();
		}
		return false;
	}

	public void add(int d) {
		Node temp = new Node(d);
		Node before = searchNode(d);
		Node after = before.getNext();
		before.setNext(temp);
		temp.setPrevious(before);

		if (after != null) {
			after.setPrevious(temp);
			temp.setNext(after);
		}
		fix(temp);
	}

	private void fix(Node current) {
		Node first = current.getPrevious();
		while (first.getUp() == null) {
			first = first.getPrevious();
		}
		int count = 1;
		Node current2 = first.getNext();
		while (current2.getUp() == null) {
			current2 = current2.getNext();
			count++;
		}
		if (count >= 3) {
			Node toPromote = first.getNext().getNext();
			Node newNode = new Node(toPromote.getData());

			Node up = first.getUp();
			Node next = first.getNext();

			up.setNext(newNode);
			newNode.setPrevious(up);

			next.setPrevious(newNode);
			newNode.setNext(next);

			fix(newNode);
		}
	}

	private Node searchNode(int d) {
		Node current = head;
		while (current != null) {
			if (current.getNext() == null || current.getNext().getData() > d) {
				if (current.getDown() == null)
					return current;
				current = current.getDown();
			} else
				current = current.getNext();
		}
		return current;

	}

}
