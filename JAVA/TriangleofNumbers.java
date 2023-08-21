// Code : Triangle of Numbers
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 4



// The dots represent spaces.



// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
//            1
//          232
//        34543
//      4567654
//    567898765
// Sample Input 2:
// 4
// Sample Output 2:
//            1
//          232
//        34543
//      4567654

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int i = 1;
			int p = 0;
			while(i <= n) {
				
				int spaces  = 1;
				while(spaces <= n-i) {
					System.out.print(' ');
					spaces = spaces + 1;
				}
				int num = 1;
				while(num <= i) {
					System.out.print(num+p);
					num = num + 1;
				}
				int dec = i - 1;
				while(dec >= 1) {
					System.out.print(dec+p);
					dec = dec - 1;
				}
				System.out.println();
				i = i+1;
				p++;
			}
		
	}
}
