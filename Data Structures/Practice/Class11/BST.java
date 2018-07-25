package Class11;

public class BST {

	TNode head;

	public void insert(char c) {
		// create new node to store c
		TNode temp = new TNode(c);

		// if tree is empty:
		if(head == null) {
			head = temp;
		}

		else {
			TNode current = head;
			boolean exit = false;
			while(!exit) {
				if(c < current.getData()) {
					if(current.getLeft() == null) {	
						// found where to put new node
						current.setLeft(temp);
						temp.setFather(current);
						exit = true;
					}
					else {	
						// continue searching
						current = current.getLeft();
					}
	
				}

				else {
					if(current.getRight() == null) { 
						// found where to put new node
						current.setRight(temp);
						temp.setFather(current);
						exit = true;
					}
					else {
						// continue searching
						current = current.getRight();
					}
				}

			}
		}

	}

	public boolean contains(char c) {
		TNode current = head;
		while(current != null) {
			if(current.getData() == c) return true;
			else if(c < current.getData()) 
				current = current.getLeft();
			else 
				current = current.getRight();
		}

		// if the while loop exited, c is note in the BST
		return false;
	}

	public boolean delete(char c) {
		if(contains(c) == false) return false;

		// find node to delete
		TNode current=head;
		while(current.getData() != c) {
			if(c < current.getData())
				current = current.getLeft();
			else 
				current = current.getRight();
		}

		TNode father = current.getFather();

		// case 1: leaf
		if(current.getLeft() == null && current.getRight() == null) {
			if(father == null) // special case: current is head
				head = null;
			else if(c < father.getData()) 
				father.setLeft(null);
			else 
				father.setRight(null);
		}

		// case 2: current has only one child
		else if (current.getLeft() == null) {
			if(father == null) { // special case: current is head
				head = current.getRight();
				head.setFather(null);
			}
			else if(c < father.getData()) { 
				father.setLeft(current.getRight());
				current.getRight().setFather(father);
			}
			else {
				father.setRight(current.getRight());
				current.getRight().setFather(father);
			}
		}

		else if (current.getRight() == null) {
			if(father == null) { // special case: current is head
				head = current.getLeft();
				head.setFather(null);
			}
			else if(c < father.getData()) { 
				father.setLeft(current.getLeft());
				current.getLeft().setFather(father);
			}
			else {
				father.setRight(current.getLeft());
				current.getLeft().setFather(father);
			}
		}

		// case 3: current has two children
		else {
			// find replacement - largest on the left side
			TNode replace = current.getLeft();
			while(replace.getRight() != null)
				replace = replace.getRight();
			// remove replacement node
			delete(replace.getData());
			// replace data
			current.setData(replace.getData());
		}


		return true;
	}
}
