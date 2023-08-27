// Level wise linkedlist
// Send Feedback
// Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.
// Input format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format :
// Each level linked list is printed in new line (elements are separated by space).
// Constraints:
// Time Limit: 1 second
// Sample Input 1:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// Sample Output 1:
// 5 
// 6 10 
// 2 3 
// 9

import java.util.*;

public class Solution 
{
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
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
     
	 */
    
    public static LinkedListNode<Integer> app(LinkedListNode<Integer> head , int data)
    {
        LinkedListNode<Integer> temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new LinkedListNode<Integer>(data);
        return head;
            
    }
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root)
    {
		Queue<BinaryTreeNode<Integer>> q = new LinkedListNode<BinaryTreeNode<Integer>>();
        ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();
        LinkedListNode<Integer> head = null;
        q.add(root);
        q.add(null);
        while (!q.isEmpty())
        {
            BinaryTreeNode<Integer> temp = q.poll();
            if (temp != null)
            {
                if (temp.left != null)
                {
                    q.add(temp.left);
                }
                if (temp.right != null)
                {
                    q.add(temp.right);
                }
                
                
            }
            else
            {
                ans.add(head);
                head = null;
                if (q.size() > 0 && q.peek() != null)
                {
                    q.add(null);
                }
                
            }
            
            if (head == null)
            {
                head = new LinkedListNode<>(root.data);
                
            }
            else 
            {
                app(head,root.data);
            }
           
	}

}
}   