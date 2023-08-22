// Staircase
// Send Feedback
// A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
// Input format :
// Integer N
// Output Format :
// Integer W
// Constraints :
// 1 <= N <= 30
// Sample Input 1 :
// 4
// Sample Output 1 :
// 7
// Sample Input 2 :
// 5
// Sample Output 2 :
// 13


public class Solution {
	
		
     public static int staircase(int n){
		int x = 0,y = 0,z = 0;
		if(n == 0)
			return 1;
		else if( n  >= 0) {//Base case for recursion
			 x = staircase(n-1);
			 y = staircase(n-2);
			 z = staircase(n-3);
		}
		return x + y + z;			
	}
	
}