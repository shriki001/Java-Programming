package Ex2;

public class LinkedListSingle<T> {
	NodeSingle<T> head;

	public LinkedListSingle() {
		head = null;
	}

	public void add(T obj) {
		if (head == null)
			head = new NodeSingle<T>(obj, null);
		else {
			NodeSingle<T> n = head;
			while (n.next != null)
				n = n.next;
			n.next = new NodeSingle<T>(obj, null);
		}
	}

	public String toString() {
		String s = "[";
		for (NodeSingle<T> follow = head; follow != null; follow = follow.next) {
			s = s + follow.toString() + ", ";
		}
		return s + "]";
	}

	public static void main(String[] args) {
		LinkedListSingle<String> list = new LinkedListSingle<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
	}


}
