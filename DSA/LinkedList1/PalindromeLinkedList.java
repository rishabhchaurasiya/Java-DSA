// Palindrome Linked List
// Send Feedback
// You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
//  Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
//  Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
//  Output format :
// For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
//  Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Time Limit: 1sec

// Where 'M' is the size of the singly linked list.
// Sample Input 1 :
// 1
// 9 2 3 3 2 9 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 2
// 0 2 3 2 5 -1
// -1
// Sample Output 2 :
// false
// true
// Explanation for the Sample Input 2 :
// For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.

// For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.

/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/
/*
public class Solution {

	public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head){
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> p = temp, q = null, r = null;

		while (temp != null && p != null) {
			r = q;
			q = p;
			p = p.next;
			q.next = r;
		}
		temp = q;
		
		return temp;
	}
	
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = new LinkedListNode<Integer>(null);
		temp = reverseLinkedList(head);

		LinkedListNode<Integer> i = temp;
		LinkedListNode<Integer> j = head;
		while (i != null && j != null) {
			if (j.data != i.data) {
				return false;
			}
			j = j.next;
			i = i.next;
		}
		return true;

	}

}		*/
import java.util.*;
public class Solution {

	// public static boolean isPalindrome(LinkedListNode<Integer> head) {
	// 	//Your code goes here
    //     LinkedListNode<Integer>temp = head;
    //     boolean ispalin = true;
    //     Stack<Integer> stack = new Stack<Integer>();
 
    //     while (temp != null) {
    //         stack.push(temp.data);
    //         temp = temp.next;
    //     }
 
    //     while (head != null) {
 
    //         int i = stack.pop();
    //         if (head.data == i) {
    //             ispalin = true;
    //         }
    //         else {
    //             ispalin = false;
    //             break;
    //         }
    //         head = head.next;
    //     }
    //     return ispalin;
    // }
	private static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head){
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> fwd = null;

		while(curr != null){
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}

		return prev;
	}


	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		
		if(head == null || head.next == null){
			return true;
		}
		// find list center
		LinkedListNode<Integer> fast = head;
		LinkedListNode<Integer> slow = head;

		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}

		LinkedListNode<Integer> secondHead = slow.next;
		slow.next = null;
		secondHead = reverseLinkedList(secondHead);

		// compare two sublists now
		LinkedListNode<Integer> firstSubList = secondHead;
		LinkedListNode<Integer> secondSubList = head;
		while(firstSubList != null){
			if(firstSubList.data != secondSubList.data){
				return false;
			}
			firstSubList = firstSubList.next;
			secondSubList = secondSubList.next;
		}

		// Rejoin the two sublists to restore the input list to its original from 
		firstSubList = head;
		secondSubList = reverseLinkedList(secondHead);
		while(firstSubList.next != null){
			firstSubList = firstSubList.next;
			
		}

		firstSubList.next = secondSubList;
		return true;
	}

}
