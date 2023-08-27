// BST to LL
// Send Feedback
// Given a BST, convert it into a sorted linked list. You have to return the head of LL.
// Input format:
// The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
// Output Format:
// The first and only line of output prints the elements of sorted linked list.
// Constraints:
// Time Limit: 1 second
// Note:
// In case if you are facing any issue to solve this problem, please prefer to use the helper function.
// Sample Input 1:
// 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
// Sample Output 1:
// 2 5 6 7 8 10

import java.util.*;
public class Solution {

		/*
		 * Binary Tree Node class
		 * 
		 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
		 * right;
		 * 
		 * public BinaryTreeNode(T data) { this.data = data; } }
		 */

		/*
		 * LinkedList Node Class
		 *
		 * 
		 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
		 * 
		 * public LinkedListNode(T data) { this.data = data; } }
		 */

		static LinkedListNode<Integer> head = null;
		static LinkedListNode<Integer> curr = head;

		public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
			result(root);
			return head;
		}

		public static void result(BinaryTreeNode<Integer> root) {
			if (root == null) {
				return;
			}
			result(root.left);
			if (head == null) {
				LinkedListNode<Integer> temp = new LinkedListNode<Integer>(root.data);
				head = temp;
				curr = head;
			} else {
				LinkedListNode<Integer> temp = new LinkedListNode<Integer>(root.data);
				curr.next = temp;
				curr = temp;
			}
			result(root.right);
		}
	}