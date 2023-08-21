// Parallelogram Pattern
// Send Feedback
// Write a program to print parallelogram pattern for the given N number of rows.
// For N = 4



// The dots represent spaces.
// Input Format :
//  A single integer : N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***
// Sample Input 2 :
// 5
// Sample Output 2 :
// *****
//  *****
//   *****
//    *****
//     *****

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			int n =scn.nextInt();
			
			int i = 1;
			while(i <= n) {
				int sp = 2;
				while(sp <= i) {
					System.out.print(' ');
					sp++;
				}
				int j =1;
				while(j <= n) {
					System.out.print('*');
					j++;
				}
				System.out.println();
				i++;
			}
		}

	}
}
