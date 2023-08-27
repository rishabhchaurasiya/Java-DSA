// BST Class
// Send Feedback
// Implement the BST class which includes following functions -
// 1. insert -
// Given an element, insert that element in the BST at the correct position. If element is equal to the data of the node, insert it in the left subtree.
// 2. search
// Given an element, find if that is present in BST or not. Return true or false.
// 3. delete -
// Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.
// 4. printTree (recursive) -
// Print the BST in in the following format -
// For printing a node with data N, you need to follow the exact format -
// N:L:x,R:y
// where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.
// There is no space in between.
// You need to print all nodes in the recursive format in different lines.


/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

public class BinarySearchTree {

    
    private BinaryTreeNode<Integer> root;
    
    		private BinaryTreeNode<Integer> insertData(BinaryTreeNode<Integer> root, int data) {
			if (root == null) {
				BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
				return newNode;
			}
			if (data > root.data) {// right side
				root.right = insertData(root.right, data);
			} else {
				root.left = insertData(root.left, data);
			}
			return root;
		}

		public void insert(int data) {
			if (root == null) {
				root = insertData(null, data);
			} else {
				BinaryTreeNode<Integer> newNode = insertData(root, data);
			}
		}
	
	private BinaryTreeNode<Integer> deleteData(BinaryTreeNode<Integer> root, int data) {
			if (root == null) {
				return null;
			}
			if (root.data == data) {
				if (root.left != null && root.right == null)
					return root.left;
				else if (root.left == null && root.right != null)
					return root.right;
				else if (root.left == null && root.right == null)
					return null;
				else {

					BinaryTreeNode<Integer> minNode = root.right;
					while (minNode.left != null) {
						minNode = minNode.left;
					}
					root.data = minNode.data;
					root.right = deleteData(root.right, minNode.data);
					return root;
				}

			} else if (root.data > data) {
				BinaryTreeNode<Integer> leftt = deleteData(root.left, data);
				root.left = leftt;
			} else {
				BinaryTreeNode<Integer> rightt = deleteData(root.right, data);
				root.right = rightt;
			}

			return root;
		}

		public void remove(int data) {
			root = deleteData(root, data);
		}
     
    	private void printTree(BinaryTreeNode<Integer> root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + ":");

			if (root.left != null && root.right != null) {
				System.out.print("L:" + root.left.data + ",R:" + root.right.data);
				System.out.println();
			} else if (root.left != null && root.right == null) {
				System.out.print("L:" + root.left.data + ",");
				System.out.println();
			} else if (root.left == null && root.right != null) {
				System.out.print("R:" + root.right.data);
				System.out.println();
			} else {
				System.out.println();
			}

			printTree(root.left);
			printTree(root.right);
		}

		public void printTree() {
			printTree(root);
			// Implement the printTree() function
		}
	
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		if (node == null)
			return false;

		if (node.data == x)
			return true;

		if (node.data > x) {
			return isPresentHelper(node.left, x);
		} else {
			return isPresentHelper(node.right, x);
		}
	}
	public boolean search(int data) {
		//Implement the search() function
        return isPresentHelper(root, data);
	}
	

}