package Class4;

public class TreeNode {
	
	private TreeNode right,left;
	private char data;
	
	public TreeNode(char data){
		this.data=data;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public char getData() {
		return data;
	}
	

}
