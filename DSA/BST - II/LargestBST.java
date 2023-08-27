// Largest BST
// Send Feedback
// Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree. You have to return the height of largest BST.
// Note :
// The binary tree will be consisting of only unique elements.
// Input format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format:
// The first and only line of output contains the height of the largest BST.
// Constraints:
// Time Limit: 1 second
// Sample Input 1:
// 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
// Sample Output 1:
// 2

// public class Solution {
// 	/*
// 	 * BinaryTreeNode class
// 	 * 
// 	 * class BinaryTreeNode<T> 
// 	 * { 
// 	 * 		T data; 
// 	 * 		BinaryTreeNode<T> left; 
// 	 * 		BinaryTreeNode<T> right;
// 	 *		public BinaryTreeNode(T data) 
// 	 *		{
// 	 *  		this.data = data; 
// 	 *  	} 
// 	 *  }
// 	 */
	
// 	static int MAX = Integer.MAX_VALUE;
// 	static int MIN = Integer.MIN_VALUE;

// 	static class BSTReturn {
// 		int size; 
// 		int max;
// 		int min; 
// 		boolean isBST;

// 		BSTReturn() {
// 		}

// 		BSTReturn(int size, int max, int min, boolean isBST) {
// 			this.size = size;
// 			this.max = max;
// 			this.min = min;
// 			this.isBST = isBST;
// 		}
// 	}

// 	static BSTReturn largestBST(BinaryTreeNode<Integer> root) {

// 		if (root == null) {
// 			return new BSTReturn(0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
// 		}

// 		BSTReturn left = largestBST(root.left);
// 		BSTReturn right = largestBST(root.right);

// 		int min = Math.min(root.data, Math.min(left.min, right.min));
// 		int max = Math.max(root.data, Math.max(left.max, right.max));

// 		boolean isBST = true;

// 		if (left.max > root.data)
// 			isBST = false;
// 		if (right.min <= root.data)
// 			isBST = false;
// 		if (!left.isBST && !right.isBST)
// 			isBST = false;

// 		int height;

// 		if (isBST)
// 			height = Math.max(left.size, right.size) + 1;
// 		else
// 			height = Math.max(left.size, right.size);
		
// 		BSTReturn ans = new BSTReturn(height,max,min,isBST);
		
// 		return ans;
// 	}

// 	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
// 		return largestBST(root).size;
// 	}

// }











class BSTsubtreeReturn
{
    int max, min, height;
    boolean isBST;
}

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
    private static BSTsubtreeReturn largestBSTSubtreeHelper(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            BSTsubtreeReturn ans = new  BSTsubtreeReturn();
            ans.max = Integer.MIN_VALUE;
            ans.min = Integer.MAX_VALUE;
            ans.isBST = true;
            ans.height = 0;
            return ans;
        }
        
         BSTsubtreeReturn leftTree =  largestBSTSubtreeHelper(root.left);
         BSTsubtreeReturn rightTree =  largestBSTSubtreeHelper(root.right);
        
        if(!(rightTree.isBST && rightTree.min > root.data))
            rightTree.isBST = false;
        
        if(!(leftTree.isBST && leftTree.max < root.data))
            leftTree.isBST = false;
        
        
        BSTsubtreeReturn ans = new  BSTsubtreeReturn();
        
        if(!leftTree.isBST || !rightTree.isBST || root.data < leftTree.max || root.data > rightTree.min)
        {
            if(leftTree.height > rightTree.height)
            {
                leftTree.isBST = false;
                return leftTree;
            }
            else
            {
                rightTree.isBST = false;
                return rightTree;
            }
        }
        
        ans.isBST = true;
        ans.min = Math.min(leftTree.min, Math.min(rightTree.min, root.data));
        ans.max = Math.max(leftTree.max, Math.max(rightTree.max, root.data));
        ans.height = Math.max(leftTree.height, rightTree.height) + 1;
        return ans;
    }
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
        return largestBSTSubtreeHelper(root).height;
	}

}