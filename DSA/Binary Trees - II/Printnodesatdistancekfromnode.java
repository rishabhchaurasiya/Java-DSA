// Print nodes at distance k from node
// Send Feedback
// You are given a Binary Tree of type integer, a target node, and an integer value K.
// Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.
// Example:
// For a given input tree(refer to the image below):
// 1. Target Node: 5
// 2. K = 2
// alt txt

// Starting from the target node 5, the nodes at distance K are 7 4 and 1.
// Input Format:
// The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

// The second line of input contains two integers separated by a single space, representing the value of the target node and K, respectively.
// Output Format:
// All the node data at distance K from the target node will be printed on a new line.

// The order in which the data is printed doesn't matter.
// Constraints:
// 1 <= N <= 10^5
// Where N is the total number of nodes in the binary tree.

// Time Limit: 1 sec
// Sample Input 1:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// 3 1
// Sample Output 1:
// 9
// 6
// Sample Input 2:
// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
// 3 3
// Sample Output 2:
// 4
// 5
import java.util.*;
/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

		public static void printKLevelDown(BinaryTreeNode<Integer> root, int k, BinaryTreeNode<Integer> blocker) {
		if (root == null || k < 0 || root == blocker)
			return;
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		printKLevelDown(root.left, k - 1, blocker);
		printKLevelDown(root.right, k - 1, blocker);

	}

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		path = new ArrayList<>();
		find(root, node);
		for (int i = 0; i < path.size(); i++) {
			printKLevelDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1));
		}
	}

	static ArrayList<BinaryTreeNode<Integer>> path;

	public static boolean find(BinaryTreeNode<Integer> root, int data) {
		if (root == null)
			return false;

		if (root.data == data) {
			path.add(root);
			return true;
		}

		boolean filc = find(root.left, data);
		if (filc) {
			path.add(root);
			return true;
		}

		boolean firc = find(root.right, data);
		if (firc) {
			path.add(root);// now this will return node value
			return true;
		}

		return false;
	}

}