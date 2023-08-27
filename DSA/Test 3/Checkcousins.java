// Check cousins
// Send Feedback
// Given the binary Tree and two nodes say ‘p’ and ‘q’. Determine whether the two nodes are cousins of each other or not. Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and have different parents.
// Do it in O(n).
// Input format :
// Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
// Line 2 : integer value of p 
// Line 3 : Integer value of q
// Output format :
// true or false
// Constraints :
// 1 <= N <= 10^5
// Sample Input :
// 5 6 10 2 3 4 -1 -1 -1 -1 9 -1 -1 -1 -1
// 2
// 4
// Sample Output :
// // true

import java.util.ArrayList;


public class solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

		static boolean isSibling(BinaryTreeNode<Integer> root, int p, int q) {
		if (root == null)
			return false;
		if (root.left != null && root.right != null) {
			if ((root.left.data == p && root.right.data == q) || (root.left.data == q && root.right.data == p)
					|| isSibling(root.left, p, q) || isSibling(root.right, p, q)) {
				return true;
			} else
				return false;
		}
		return false;
	}

    static int level(BinaryTreeNode<Integer> root, int ptr, int lev)
    {
        if (root == null)
            return 0;
 
        if (root.data == ptr)
            return lev;
 
        int l = level(root.left, ptr, lev + 1);
        if (l != 0)
            return l;
 
        return level(root.right, ptr, lev + 1);
    }
 
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        if(root == null)return false;
        return ((level(root, p, 1) == level(root, q, 1)) &&
                (!isSibling(root, p, q)));
    }
}


