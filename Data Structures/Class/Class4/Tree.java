package Class4;

public class Tree {

	private TreeNode root;

	public void printPreOrder() {
		printPreOrder(root);
	}

	public void printInOrder() {
		printInOrder(root);
	}

	public void printPostOrder() {
		printPostOrder(root);
	}

	public int height() {
		return height(root);
	}

	public void add(char data) {
		TreeNode n = new TreeNode(data);
		if (root == null)
			root = n;
		else
			add(root, n);
	}

	public boolean search(char c) {
		return search(root, c);
	}

	private boolean search(TreeNode n, char c) {
		if (n == null)
			return false;
		else {
			if (c == n.getData())
				return true;
			else if (c < n.getData())
				return search(n.getLeft(), c);
			else
				return search(n.getRight(), c);
		}
	}

	private void add(TreeNode parent, TreeNode n) {
		if (n.getData() > parent.getData()) {
			if (parent.getRight() == null)
				parent.setRight(n);
			else
				add(parent.getRight(), n);
		} else {
			if (parent.getLeft() == null)
				parent.setLeft(n);
			else
				add(parent.getLeft(), n);
		}

	}

	/*
	 * private int depth(TreeNode n) { if (n.equals(root)) return 0; else return
	 * 1 + depth(n.getParent()); }
	 */
	private int height(TreeNode n) {
		if (n == null)
			return -1;
		else {
			int left_height = height(n.getLeft());
			int right_height = height(n.getRight());
			return 1 + Math.max(left_height, right_height);
		}
	}

	private void printPreOrder(TreeNode n) {
		if (n != null) {
			System.out.println(n.getData() + " ");
			printPreOrder(n.getLeft());
			printPreOrder(n.getRight());
		}
	}

	private void printInOrder(TreeNode n) {
		if (n != null) {
			printInOrder(n.getLeft());
			System.out.println(n.getData() + " ");
			printInOrder(n.getRight());
		}
	}

	private void printPostOrder(TreeNode n) {
		if (n != null) {
			printPostOrder(n.getLeft());
			printPostOrder(n.getRight());
			System.out.println(n.getData() + " ");
		}
	}

}
