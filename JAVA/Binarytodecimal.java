// Binary to decimal
// Send Feedback
// Given a binary number as an integer N, convert it into decimal and print.
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int num = s.nextInt();
		
		double i =0;
		double n = 0;
		double digit = 0;
		
		while(num != 0) {
		      digit = num % 10;
		      n = n + digit*(Math.pow(2, i));
		      i++;
		      num /= 10;
		    }
		System.out.println(Math.round(n));
	}
}
