// Odd Square
// Send Feedback
// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135
// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 135
// 351
// 513
// Sample Input 2 :
//  5
// Sample Output 2 :
// 13579
// 35791
// 57913
// 79135
// 91357

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			int n =scn.nextInt();
			int i = 1;
            
			while(i<=n) {
                int j=n;
                int odd= 2*i-1;
                while(j>=i) {
                    System.out.print(odd);
                    odd=odd+2;
                    j--;
                }
                if(j!=0) {
                    int p=1,temp=1;
                    while (temp<i) {
                        System.out.print(p);
                        p=p+2;
                        temp++;
                    }
                }
                System.out.println();
                i++;
        	}
		}
	}
}
