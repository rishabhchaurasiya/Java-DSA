// Even after Odd Linked List
// Send Feedback
// For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
// Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.
// Input format:
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the singly linked list separated by a single space. 
//  Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output format:
// For each test case/query, print the elements of the updated singly linked list.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Where M is the size of the singly linked list.

// Time Limit: 1sec
// Sample Input 1 :
// 1
// 1 4 5 2 -1
// Sample Output 1 :
// 1 5 4 2 
// Sample Input 2 :
// 2
// 1 11 3 6 8 0 9 -1
// 10 20 30 40 -1
// Sample Output 2 :
// 1 11 3 9 6 8 0
// 10 20 30 40

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


public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> head_even = null;
        LinkedListNode<Integer> head_odd = null;
        LinkedListNode<Integer> temp_even = null;
        LinkedListNode<Integer>  temp_odd = null;
        while(head!=null)
        {
            if(head.data%2==0)
            {
                if(head_even==null)
                {
                    head_even = head;
                    temp_even = head;
                    head = head.next;
                }
                else
                
                    temp_even.next = head;
                    
                    temp_even = temp_even.next;
                head = head.next;
            
            }
            else
            {
                if(head_odd==null)
                {
                   
                    head_odd = head;
                    temp_odd = head;
                    head = head.next;
                }
                else
                {
                    
                
            
                    temp_odd.next = head;
                   
                    temp_odd = temp_odd.next;
                 head = head.next;
                }
                
            }
            
        }
         if(head_odd==null)
         {
             return head_even;
         }
        else if(head_even==null)
        {
            return head_odd;
        }
        temp_odd.next = head_even;
        temp_even.next = null;
        return head_odd;
        
        
            
        
	}
}