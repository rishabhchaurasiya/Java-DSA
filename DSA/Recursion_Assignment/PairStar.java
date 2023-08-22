// Pair Star
// Send Feedback
// Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
// Input format :
// String S
// Output format :
// Modified string
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// hello
// Sample Output 1:
// hel*lo
// Sample Input 2 :
// aaaa
// Sample Output 2 :
// a*a*a*a


public class solution {

	// Return the updated string
	public static String addStars(String s) {
		int i = 0;
		String ans = "";
		if(s.length() == 1)
			return s.charAt(0)+"";
		if(s.charAt(i) == s.charAt(i+1))
			 ans = s.charAt(i) + "*";
		else
			ans = s.charAt(i)+"";
		return ans + addStars(s.substring(1));

	}
}
