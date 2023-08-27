// Structurally identical
// Send Feedback
// Given two Generic trees, return true if they are structurally identical i.e. they are made of nodes with the same values arranged in the same way.
// Input format :
// Line 1 : Tree 1 elements in level order form separated by space (as per done in class) in the following order:
// root_data, n (number of children of root), n children, and so on for every element.
// Line 2 : Tree 2 elements in level order form separated by space (as per done in class). Order is - `
// root_data, n (number of children of root), n children, and so on for every element.
// Output format :
// true or false
// Sample Input 1 :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// 10 3 20 30 40 2 40 50 0 0 0 0
// Sample Output 1 :
// true
// Explanation
// If we draw the tree for the above inputs, both the trees will look like this. So the answer for this is true.


// Sample Input 2 :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// 10 3 2 30 40 2 40 50 0 0 0 0
// Sample Output 2:
// false

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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if(root1.children.size() != root2.children.size())
            return false;
		if(root1 != null ^ root2 != null)
			return false;
		if(root1.data != root2.data)
			return false;
		for(int i = 0; i < root1.children.size() ;i++) {
			TreeNode<Integer> temp1 = root1.children.get(i);
			TreeNode<Integer> temp2 = root2.children.get(i);
			if(!checkIdentical(temp1,temp2))
				return false;
		}
		return true;
	}
	
}
