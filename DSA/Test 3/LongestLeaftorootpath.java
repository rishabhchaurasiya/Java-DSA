// Longest Leaf to root path
// Send Feedback
// Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain maximum number of nodes from leaf to root.
// Input format :
// Elements in level order form (separated by space)
// (If any node does not have left or right child, take -1 in its place)
// Output format :
// Line 1 : Binary Tree 1 (separated by space)
// Sample Input 1 :
//  5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// Input Graph

// Sample Output 1 :
// 9
// 3
// 6
// 5
// Input Graph

import java.util.ArrayList;

public class Solution {

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
	
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root) {
		// Write your code here

		if (root == null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}

		ArrayList<Integer> right = longestRootToLeafPath(root.right);
		ArrayList<Integer> left = longestRootToLeafPath(root.left);
		if (right.size() < left.size()) {
			left.add(root.data);
		} else {
			right.add(root.data);
		}

		if (left.size() > right.size()){
            return left;
        }else
            return right;
	}

	
	
}