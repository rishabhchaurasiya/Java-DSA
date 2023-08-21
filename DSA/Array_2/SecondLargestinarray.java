// Second Largest in array
// Send Feedback
// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
// Input format :
// The first line contains an integer 'N' representing the size of the array/list.

// The second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// Return the second largest element in the array/list.
// Constraints :
// 0 <= N <= 10^2
// 1<=arr[i]<=10^3

// Time Limit: 1 sec
// Sample Input 1:
// 5
// 4 3 10 9 2
// Sample Output 1:
// 9
// Sample Input 2:
// 7
// 13 6 31 14 29 44 3
// Sample Output 2:
// 31

public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        
        int n = arr.length, l=Integer.MIN_VALUE, sl=Integer.MIN_VALUE;
        
        if(n <= 1)
            return Integer.MIN_VALUE;
        
        else {
            int flag = 0, a = arr[0];
            
            for(int i=1; i<arr.length; i++)
            {
                if(arr[i] != a)
                    flag++;
            }
            
            if(flag == 0)
                return Integer.MIN_VALUE;
            
            for(int i=0; i<n; i++)
            {
                if(arr[i] > l)
                    l = arr[i];
            }
            
            for(int i=0; i<n; i++)
            {
                if((arr[i] > sl) && (arr[i] != l))
                    sl = arr[i];
            }
        }
        return sl;
    }

}