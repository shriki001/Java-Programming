package Class3;

public class Node {

	private String data;
	private Node next;
	private Node prev;

	public Node(String data) {
		this.data = data;

	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrev() {
		return next;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public String getData() {
		return data;
	}

}
