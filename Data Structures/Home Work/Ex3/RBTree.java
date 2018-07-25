package Ex3;

public class RBTree {

	private RedBlackNode root;
	
//*********************** Insert **********************************************************************************************************
	
	public void insert(int item) {
		RedBlackNode temp = new RedBlackNode(item, 0);
		if (root == null) {
			root = temp;
			root.setColor(1);
		} else {
			RedBlackNode current = root;
			boolean end = false;
			while (!end) {
				if (item < current.getData()) {
					if (current.getLeft() == null) {
						current.setLeft(temp);
						temp.setParent(current);
						end = true;
					} else
						current = current.getLeft();
				} else {
					if (current.getRight() == null) {
						current.setRight(temp);
						temp.setParent(current);
						end = true;
					} else
						current = current.getRight();
				}
			}
			current = temp;
			current.setColor(0);
			RedBlackNode uncle;
			while (current != root && current.getParent().getColor() == 0) {
				if (current.getParent().getParent().getLeft() == current.getParent())
					uncle = current.getParent().getParent().getRight();
				else
					uncle = current.getParent().getParent().getLeft();
				if (uncle != null && uncle.getColor() == 0) {
					uncle.setColor(1);
					current.getParent().setColor(1);
					current.getParent().getParent().setColor(0);
					current = current.getParent().getParent();
				} else {
					if (current.getParent().getParent().getLeft() == current.getParent()) {
						if (current.getParent().getRight() == current) {
							current = current.getParent();
							rotateLeft(current);
						}
						current.getParent().setColor(1);
						current.getParent().getParent().setColor(0);
						rotateRight(current.getParent().getParent());
					} else {
						if (current.getParent().getLeft() == current) {
							current = current.getParent();
							rotateRight(current);
						}
						current.getParent().setColor(1);
						current.getParent().getParent().setColor(0);
						rotateLeft(current.getParent().getParent());
					}
				}
				root.setColor(1);
			}
		}
	}
	
	private void rotateRight(RedBlackNode x) {
		RedBlackNode y = x.getLeft();
		x.setLeft(y.getRight());
		if (y.getRight() != null)
			y.getRight().setParent(x);
		y.setParent(x.getParent());
		if (x.getParent() == null)
			root = y;
		else {
			if (x == x.getParent().getRight())
				x.getParent().setRight(y);
			else
				x.getParent().setLeft(y);
		}
		y.setRight(x);
		x.setParent(y);
	}
	
	private void rotateLeft(RedBlackNode x) {
		RedBlackNode y = x.getRight();
		x.setRight(y.getLeft());
		if (y.getLeft() != null)
			y.getLeft().setParent(x);
		y.setParent(x.getParent());
		if (x.getParent() == null)
			root = y;
		else {
			if (x == x.getParent().getLeft())
				x.getParent().setLeft(y);
			else
				x.getParent().setRight(y);
		}
		y.setLeft(x);
		x.setParent(y);
	}

	private boolean isRed(RedBlackNode n) {
		if (n == null)
			return false;
		return (n.getColor() == 0);
	}
	
//********************* Search ************************************************************************************************************

	public boolean search(int val) {
		return search(root, val);
	}

	private boolean search(RedBlackNode root, int val) {
		RedBlackNode current = root;
		while (current != null) {
			if (current.getData() == val)
				return true;
			else if (val < current.getData())
				current = current.getLeft();
			else
				current = current.getRight();
		}
		return false;
	}

//********************* Print InOrder *****************************************************************************************************

	public void inorder() {
		inorder(root);
	}

	private void inorder(RedBlackNode r) {
		if (r == null)
			return;
		inorder(r.getLeft());
		System.out.print(r.getData() + ", ");
		inorder(r.getRight());
	}

//********************* Red Node Counting *************************************************************************************************

	public int countRedNodes() {
		return countRedNodes(root);
	}

	public int countRedNodes(RedBlackNode node) {
		int count = 0;
		if (node == null)
			return 0;
		if (isRed(node))
			count++;
		return (count + countRedNodes(node.getLeft()) + countRedNodes(node.getRight()));
	}

//********************* Black height ******************************************************************************************************

	public int countBlackHeight() {
		return height(root);
	}

	private int height(RedBlackNode x) {
		if (x == null)
			return -1;
		return 1 + Math.max(height(x.getLeft()), height(x.getRight()));
	}

//********************* Print Tree ********************************************************************************************************

	public void printTree() {
		if (root != null) {
			printTree(root.getRight(), true, "");
			System.out.println(root.getData() + " (" + root.getColor() + ")");
			printTree(root.getLeft(), false, "");
		}
	}

	private void printTree(RedBlackNode node, boolean isRight, String indent) {
		if (node != null) {
			printTree(node.getRight(), true, indent + (isRight ? " " : " | "));
			System.out.print(indent);
			if (isRight)
				System.out.print(" /");
			else
				System.out.print(" \\");
			System.out.print("----- ");
			System.out.println(node.getData() + " (" + node.getColor() + ")");
			printTree(node.getLeft(), false, indent + (isRight ? " |" : " "));
		}
	}
}