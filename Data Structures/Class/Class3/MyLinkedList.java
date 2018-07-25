package Class3;

public class MyLinkedList {

	Node tail;
	Node head;

	public Node addHead(String data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			n.setNext(head);
			head.setPrev(n);
			head = n;
		}
		return n;
	}

	public Node addTail(String data) {
		Node n = new Node(data);
		if (tail == null) {
			head = n;
			tail = n;
		} else {
			tail.setNext(n);
			n.setPrev(tail);
			tail = n;
		}
		return n;
	}

	public void delete(Node e) {
		Node p = e.getPrev();
		Node n = e.getNext();
		
		if (e == head && e == tail) {
			head = null;
			tail = null;
		}
		
		if (e == tail) {
			p.setNext(null);
			tail = p;
		} 
		
		else if (e == head) {
			n.setPrev(null);
			head = n;
		}
		
		else {
			p.setNext(n);
			n.setPrev(p);
		}

	}

	public Node add(Node e, String data) {// add data after Node n
		if (e == tail)
			return addTail(data);
		else {
			Node n = new Node(data);
			n.setNext(e.getNext());
			e.setNext(n);
			return e;
		}

	}

	public boolean search(String data) {
		Node current = head;
		while (current != null) {
			if (data.equals(current.getData()))
				return true;
			current = current.getNext();
		}
		return false;
	}

	public boolean delete(String data) {
		if (head == null)
			return false;
		else if (head == tail) {
			if (data.equals(head.getData())) {
				head = null;
				tail = null;
				return true;
			} else
				return false;
		} else if (data.equals(head.getData())) {
			head = head.getNext();
			return true;
		}
		Node previos = head;
		Node current = head.getNext();

		while (current != null) {
			if (data.equals(current.getData())) {
				if (current == tail)
					tail = previos;
				previos.setNext(current.getNext());
				return true;
			} else {
				previos = current;
				current = current.getNext();
			}
		}
		return false;
	}

	public String toString() {

		String ans = "[";
		Node current = head;
		while (current != null) {
			ans += current.getData() + " ";
			current = current.getNext();
		}
		ans += "]";
		return ans;
	}

}
