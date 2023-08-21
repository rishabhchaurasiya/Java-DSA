// Sum Pattern
// Send Feedback
// Write a program to print triangle of user defined integers sum.
// Input Format :
// A single integer, N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6
// Sample Input 2 :
//  5
// Sample Output 2 :
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int sum;
        
        for(int i=1; i<=n; i++) {
            
            sum = 0;
            
            for(int j=1; j<=i; j++) {

                if(j == i) {
                    System.out.print(j + "=");
                    sum += j;
                } else {
                    System.out.print(j + "+");
                    sum += j;
                }
            
            }
            
            System.out.print(sum);
            
            System.out.println();
            
        }
        
        
// 		try (Scanner scn = new Scanner(System.in)){
// 			int n =scn.nextInt();
// 			int i = 1;
			
// 			int a = 1;
// 			int q = 1;
// 			while(i<=n) {
// 				int j = 1;
// 				int p = 1;
// 				while(j <= i) {
// 					if(a==1) {
// 					System.out.print(p + "="+ q);
// 					}
// 					j++;
// 					if(a>1) {
// 					System.out.println(p + "+" + j + "="+ q);
// 					}
// 					a++;
// 					q = i+j;
// 				}
// 				i++;
// 				System.out.println();
// 			}
// 		}
	}
}
