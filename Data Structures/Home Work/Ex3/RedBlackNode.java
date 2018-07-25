package Ex3;

public class RedBlackNode {

	RedBlackNode left, right, parent;
	int data, color;

	static final int BLACK = 1;
	static final int RED = 0;
	
	public RedBlackNode(int data, int color) {
		this.data = data;
		this.color = color;
	}

	public RedBlackNode(int data) {
		this.data = data;
	}

	public RedBlackNode getLeft() {
		return left;
	}

	public void setLeft(RedBlackNode left) {
		this.left = left;
	}

	public RedBlackNode getRight() {
		return right;
	}

	public void setRight(RedBlackNode right) {
		this.right = right;
	}

	public RedBlackNode getParent() {
		return parent;
	}

	public void setParent(RedBlackNode parent) {
		this.parent = parent;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
