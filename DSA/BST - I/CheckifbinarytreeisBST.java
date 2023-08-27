// Check if binary tree is BST?
// Send Feedback
// Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
// Note: Duplicate elements should be kept in the right subtree.
// Input format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format :
// The first and only line of output contains either true or false.
// Constraints :
// Time Limit: 1 second
// Sample Input 1 :
// 3 1 5 -1 2 -1 -1 -1 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
// Sample Output 2 :
// false

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

// public class Solution {

// 		/* Your class should be named Solution
// 		 * Don't write main().
// 		 * Don't read input, it is passed as function argument.
// 		 * Return output and don't print it.
// 	 	 * Taking input and printing output is handled automatically.
//         */
//     public static boolean isBST(BinaryTreeNode<Integer> root) {
// 		if (root == null)
// 			return true;

// 		int leftMax = getMax(root.left);
// 		if (leftMax >= root.data)
// 			return false;

// 		int rightMin = getMin(root.right);
// 		if (rightMin < root.data)
// 			return false;

// 		boolean isLeftBST = isBST(root.left);
// 		boolean isRightBST = isBST(root.right);

// 		return isLeftBST && isRightBST;
// 	}

//     public static Integer getMin(BinaryTreeNode<Integer> root) {
// 		if (root == null)
// 			return Integer.MAX_VALUE;
		
// 		int leftMin = getMin(root.left);
// 		int rightMin = getMin(root.right);
// 		return Math.min(root.data,Math.min(leftMin, rightMin));
// 	}

// 	public static Integer getMax(BinaryTreeNode<Integer> root) {
// 		if (root == null)
// 			return Integer.MIN_VALUE;
// 		int left = getMax(root.left);
// 		int right = getMax(root.right);
// 		return Math.max(root.data,Math.max(left, right));
// 	}
// }
import java.util.*;

public class Solution {

//     public static int maximum(BinaryTreeNode<Integer> root)
//     {
//            if(root==null)
//             return Integer.MIN_VALUE;
       
//         return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
        
//     }
    
    
//      public static int minimum(BinaryTreeNode<Integer> root)
//     {
//             if(root==null)
//             return Integer.MAX_VALUE;
       
//         return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
//     }
    
    
    public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if(root == null)
			return true;
		
		if(root.data < minRange || root.data > maxRange) {
			return false;			
		}
		
		boolean isLeftWithRange = isBST3(root.left,minRange,root.data-1);
		boolean isRightWithRange = isBST3(root.right,root.data,maxRange);
		return isLeftWithRange && isRightWithRange;
	}
    

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		return isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
// 		if(root==null)
//             return true;
        
        
//         int leftmax= getMax(root.left);
//         int rightmin=getMin(root.right);
        
        // if(root.data<=leftmax)
        //  return false;

        // if(root.data>rightmin)
        //  return false;
        
        
       	// return isBST(root.left) && isBST(root.right);
     
         
    
     
        
       
        
        
	}
}