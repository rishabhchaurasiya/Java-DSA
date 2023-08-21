// Leaders in array
// Send Feedback
// Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
// Print all the leader elements separated by space and in the same order they are present in the input array.
// Input Format :
// Line 1 : Integer n, size of array
// Line 2 : Array A elements (separated by space)
// Output Format :
//  leaders of array (separated by space)
// Constraints :
// 1 <= n <= 10^6
// Sample Input 1 :
// 6
// 3 12 34 2 0 -1
// Sample Output 1 :
// 34 2 0 -1
// Sample Input 2 :
// 5
// 13 17 5 4 6
// Sample Output 2 :
// 17 6


public class Solution {
	static String minWord = "", maxWord = "";
	public static String minLengthWord(String input){
		
		// Write your code here
        input=input.trim();//Triming any space before the String else space at start would be consider as smallest word     
        // minWord and maxWord are received by reference
        // and not by value
        // will be used to store and return output
         
        int len = input.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0,
              max_length = 0, max_start_index = 0;
 
        // Loop while input string is not empty
        while (ei <= len)
        {
            if (ei < len && input.charAt(ei) != ' ')
            {
                ei++;
            }
            else
            {
                // end of a word
                // find curr word length
                int curr_length = ei - si;
 
                if (curr_length < min_length)
                {
                    min_length = curr_length;
                    min_start_index = si;
                }
 
                if (curr_length > max_length)
                {
                    max_length = curr_length;
                    max_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
 
        // store minimum and maximum length words
        minWord = input.substring(min_start_index, min_start_index + min_length);
        maxWord = input.substring(max_start_index, max_start_index+max_length);//Earlier  code was not working if the largests word is inbetween String
    	

	}
}
