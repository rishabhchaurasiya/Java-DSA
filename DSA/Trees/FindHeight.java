// Code : Find Height
// Send Feedback
// Given a generic tree, find and return the height of given tree. The height of a tree is defined as the longest distance from root node to any of the leaf node. Assume the height of a tree with a single node is 1.
// Input Format:
// The first line of input contains data of the nodes of the tree in level order form. The order is: data for root node, number of children to root node, data of each of child nodes and so on and so forth for each node. The data of the nodes of the tree is separated by space.  

// For the above tree, height will be 3 as the leaf nodes which are present at longest distance are 40, 50.(10->20->40) or (10->20->50).
// Output Format :
// The first and only line of output prints the height of the given generic tree.
// Constraints:
// Time Limit: 1 sec
// Sample Input 1:
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1:
// 3

import java.util.*;
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
	static int height = 0;
	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		// if(root == null)
		// 	return 0;
		// int count = 0;
		// Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		// pendingNodes.add(root);
		// while (!pendingNodes.isEmpty()) {
		// 	int n = pendingNodes.size();
		// 	while (n > 0) {
		// 		TreeNode<Integer> front = pendingNodes.peek();
		// 		pendingNodes.remove();
		// 		for (int i = 0; i < front.children.size(); i++) {
		// 			pendingNodes.add(front.children.get(i));
		// 		}
		// 		n--;
		// 	}
		// 	count++;
		// }
		// return count;
        
        int height = 0;
		for(TreeNode<Integer> child : root.children) {
			int ch = getHeight(child);
			height = Math.max(ch, height);
		}
		return height + 1;
	}

}