package Ex3;

public class CopyOfTest3 {

	public static void main(String[] args) {
		RBTree rbt = new RBTree();
		System.out.println("1. Red Black Tree Print \n");
		int[] a = { 30, 15, 25, 17, 2, 8, 11, 20, 21, 18, 4 };
		int i = 0;
		while (i < a.length) {
			rbt.insert(a[i]);
			i++;
		}
		rbt.printTree();
		System.out.println();
		System.out.println("2. Search Value \n");
		int[] b = { 30, 17, 21, 48, 62, 56 };
		int j = 0;
		while (j < b.length) {
			System.out.println("Leaf: " + b[j] + " = " + rbt.search(b[j]));
			j++;
		}
		System.out.println();
		System.out.println("3. inOrderPrint \n");
		rbt.inorder();
		System.out.println();
		System.out.println();
		System.out.println("4. Red Nodes \n");
		System.out.println("Nodes = " + rbt.countRedNodes());
		System.out.println();
		System.out.println("5. BlackHeight \n");
		System.out.println("BlackHeight = " + rbt.countBlackHeight());
	}
}
