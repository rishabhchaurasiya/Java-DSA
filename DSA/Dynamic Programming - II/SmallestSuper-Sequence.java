// Smallest Super-Sequence
// Send Feedback
//  Given two strings S and T with lengths M and N. Find and return the length of their shortest 'Super Sequence'.
//  The shortest 'Super Sequence' of two strings is defined as the smallest string possible that will have both the given strings as its subsequences.
// Note :
// If the two strings do not have any common characters, then return the sum of the lengths of the two strings. 
// Input Format:
// The first only line of input contains a string, that denotes the value of string S. The following line contains a string, that denotes the value of string T.
// Output Format:
// Length of the smallest super-sequence of given two strings. 
// Constraints :
// 0 <= M <= 10 ^ 3
// 0 <= N <= 10 ^ 3

// Time Limit: 1 sec
// Sample Input 1 :
// ab
// ac
// Sample Output 1 :
// 3
// Explanation of Sample Output 1 :
// Their smallest super sequence can be "abc" which has length = 3.
// Sample Input 2 :
// pqqrpt
// qerepct
// Sample Output 2 :
// 9

public class Solution {

	
        
    static int smallestSuperSequence(String X, String Y)
    {
        int m = X.length();
        int n = Y.length();

        int l = lcs(X, Y, m, n);

        return (m + n - l);
    }
 
    static int lcs(String X, String Y, int m, int n)
    {
        int[][] L = new int[m + 1][n + 1];
        int i, j;
 
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
 
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
 
                else
                    L[i][j] = Math.max(L[i - 1][j],
                                       L[i][j - 1]);
            }
        }
 
        return L[m][n];
    }
        
}