package Class11;

public class TNode {
	private TNode left,father,right;
	char data;
	
	public TNode(char data){
		this.data=data;
	}

	public TNode getLeft() {
		return left;
	}

	public void setLeft(TNode left) {
		this.left = left;
	}

	public TNode getFather() {
		return father;
	}

	public void setFather(TNode father) {
		this.father = father;
	}

	public TNode getRight() {
		return right;
	}

	public void setRight(TNode right) {
		this.right = right;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

}
