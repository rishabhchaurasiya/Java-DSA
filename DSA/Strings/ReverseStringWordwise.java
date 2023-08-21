// Reverse String Wordwise
// Send Feedback
// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
// Input format :
// String in a single line
// Output format :
// Word wise reversed string in a single line
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// Ninjas Coding to Welcome
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// code your indent Always

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String ans = "";
		int currentWordStart = 0;
		int i = 0;
        
        String swap = "";
        for(int k = input.length() - 1; k >= 0; k--){
            swap += input.charAt(k);
		}
		
		for(; i < swap.length(); i++) {
			if(swap.charAt(i) == ' ') {
				//Reverse Current WOrd
				int currentWordEnd = i -1;
				String reversedWord = "";
				for(int j = currentWordStart; j <= currentWordEnd; j++) {
					reversedWord = swap.charAt(j) + reversedWord;
				}
				//Add it final string(ans)
				ans += reversedWord + " ";
				currentWordStart = i+1;
			}
		}
		int currentWordEnd = i -1;
		String reversedWord = "";
		for(int j = currentWordStart; j <= currentWordEnd; j++) {
			reversedWord = swap.charAt(j) + reversedWord;
		}
		//Add it final string(ans)
		ans += reversedWord; 
		
		return ans;

	}
}
