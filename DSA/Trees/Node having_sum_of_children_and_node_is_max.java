// Node having sum of children and node is max
// Send Feedback
// Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
// Input format :

// Line 1 : Elements in level order form separated by space (as per done in class). Order is -

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

// Output format : Node with maximum sum.

// Sample Input 1 :
// 5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
// Representation of input


// Sample Output 1 :
// 1
// Explanation
// Sum of node 1 and it's child (15) is maximum among all the nodes, so the output for this is 1.


public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
		public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
		if (root == null)
			return null;
		TreeNode<Integer> result = root;
		int maxSum = sumNode(root);// calculate sum of node for root node
		int childCount = root.children.size();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> temp = maxSumNode(root.children.get(i));
			int sum = sumNode(temp);
			if (sum > maxSum) {
				maxSum = sum;
				result = temp;
			}
		}
		return result;
	}

	public static int sumNode(TreeNode<Integer> root) {
		// called by mansumNode
		if (root == null)
			return 0;
		int sum = root.data;
		int childCount = root.children.size();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> temp = root.children.get(i);
			sum += temp.data;
		}
		return sum;
	}
	
		
}
