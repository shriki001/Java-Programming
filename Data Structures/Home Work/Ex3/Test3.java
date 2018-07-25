package Ex3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/* Creating object of RedBlack Tree */
		Scanner input = new Scanner(System.in);
		RBTree rbt = new RBTree();
		System.out.println("Red Black Tree Test\n");
		char ch;
		/* Perform tree operations */
		do {
			System.out.println("\nRed Black Tree Operations\n");
			System.out.println("1. insert ");
			System.out.println("2. search");
			System.out.println("3. count Red nodes");
			System.out.println("4. inorder traversal");
			System.out.println("5. compute black height");

			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer data to insert");
				rbt.insert(input.nextInt());
				// display tree
				rbt.printTree();
				break;
			case 2:
				System.out.println("Enter integer data to search");
				System.out.println("Search result : "
						+ rbt.search(input.nextInt()));
				break;
			case 3:
				System.out.println("Number of red nodes is "
						+ rbt.countRedNodes());
				break;
			case 4:
				rbt.inorder();
				break;
			case 5:
				System.out.println("The Black height is "
						+ rbt.countBlackHeight());
				break;
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = input.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		input.close();
	}
}