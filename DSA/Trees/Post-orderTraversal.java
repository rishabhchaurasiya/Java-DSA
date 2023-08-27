// Code : Post-order Traversal
// Send Feedback
// Given a generic tree, print the post-order traversal of given tree.
// The post-order traversal is: visit child nodes first and then root node.

// For the given tree, the post order traversal will be 40 50 20 30 40 10
// Input format:
// The first line of input contains data of the nodes of the tree in level order form. The order is: data for root node, number of children to root node, data of each of child nodes and so on and so forth for each node. The data of the nodes of the tree is separated by space.
// Output Format :
// The first and only line of output contains the elements printed in post-order traversal. The elements in the output must be separated by a single space.
// Constraints:
// Time Limit: 1 sec
// Sample Input 1:
// 10 3 20 30 40 2 400 50 0 0 0 0 
// Sample Output 1:
// 400 50 20 30 40 10
// Explanation
// For 10 , total 3 children are there : 20 30 40
// For  20, total 2 children are there : 400 50
// So, the output will be 400 50 20 30 40 10

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

	public static void printPostOrder(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
        if(root == null)
			return;
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printPostOrder(child);
		}
		System.out.print(root.data + " ");
	}

}