// Minimum Length Word
// Send Feedback
// Given a string S (that can contain multiple words), you need to find the word which has minimum length.
// Note : If multiple words are of same length, then answer will be first minimum length word in the string.
// Words are seperated by single space only.
// Input Format :
// String S
// Output Format :
// Minimum length word
// Constraints :
// 1 <= Length of String S <= 10^5
// Sample Input 1 :
// this is test string
// Sample Output 1 :
// is
// Sample Input 2 :
// abc de ghihjk a uvw h j
// Sample Output 2 :
// a


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
    	return minWord;

	}
}
