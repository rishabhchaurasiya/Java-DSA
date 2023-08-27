// Second Largest Element In Tree
// Send Feedback
// Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.
// Input format :
// Elements in level order form separated by space (as per done in class). Order is - 

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
// Output format:
// Second Largest node data
// Sample Input 1 :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
// 40



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
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        TreeNode<Integer> firstLargest = new TreeNode<Integer>(Integer.MIN_VALUE);
        TreeNode<Integer> secondLargest = new TreeNode<Integer>(Integer.MIN_VALUE);
               
        secondLargest = helper( root , firstLargest , secondLargest);
        
        if(secondLargest.data != Integer.MIN_VALUE )
            return secondLargest ;
        else 
            return null ;
     }
    
    public static TreeNode<Integer> helper(TreeNode<Integer> root,TreeNode<Integer> fLargest,TreeNode<Integer> sLargest){
          if (root.data > fLargest.data){
             sLargest.data = fLargest.data;
             fLargest.data = root.data;
            }
        else if (root.data > sLargest.data && root.data != fLargest.data){
            sLargest.data = root.data;
        }        
        for (int i=0; i<root.children.size(); i++)
        {
            sLargest = helper(root.children.get(i),fLargest,sLargest);
        }
        return sLargest;
    }
}
