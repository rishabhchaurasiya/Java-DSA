// Zeros and Stars Pattern
// Send Feedback
// Print the following pattern
// Pattern for N = 4
// *000*000*
// 0*00*00*0
// 00*0*0*00
// 000***000
// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Sample Input 1 :
// 3
// Sample Output 1 :
// *00*00*
// 0*0*0*0
// 00***00
// Sample Input 2 :
// 5
// Sample Output 2 :
// *0000*0000*
// 0*000*000*0
// 00*00*00*00
// 000*0*0*000
// 0000***0000

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int sum;
		int add;
		for (int i = 1; i <= n; i++) {

			sum = 0;
			add = 0;
			for (int j = 1; j <= n; j++) {

				if (j == i) {
					System.out.print("*");
					sum += j;
				} else {
					System.out.print("0");
					sum += j;
				}

			}
			for (int l = 1; l <= n+1; l++) {
				if(l == n+1) {
					System.out.print("*");
				}			
			}
			for (int k = n; k >= 1; k--) {
				if (k == i) {
					System.out.print("*");
					add += k;
				} else {
					System.out.print("0");
					add += k;
				}
			}

			System.out.println();
			
		}
	}

}
