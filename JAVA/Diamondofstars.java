// Code : Diamond of stars
// Send Feedback
// Print the following pattern for the given number of rows.
// Note: N is always odd.


// Pattern for N = 5



// The dots represent spaces.



// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   *

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int nsp = n/2;
			int nst = 1;
			for(int r=1;r<=n;r++) {
				for(int csp = 1; csp<= nsp; csp++) {
					System.out.print(' ');
					}
				for(int cst = 1; cst<= nst; cst++) {
					System.out.print('*');
				}
				if(r <= n/2) {
					nsp = nsp -1;
					nst = nst+2;
				}
				else {
					nsp = nsp + 1;
					nst = nst - 2;
				}
				System.out.println();
			}			
			
		
        
    }
}