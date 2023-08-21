// Half Diamond Pattern
// Send Feedback
// Write a program to print N number of rows for Half Diamond pattern using stars and numbers
// Note : There are no spaces between the characters in a single line.


// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *
// Sample Input 2 :
//  5
// Sample Output 2 :
// *
// *1*
// *121*
// *12321*
// *1234321*
// *123454321*
// *1234321*
// *12321*
// *121*
// *1*
// *

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
			int n =scn.nextInt();
			int x=1;
			if(n==0) {
				System.out.println('*');
				System.out.println('*');
			}
			else {
				for(int r=1;r<=(2*n+1);r++){
				        int y=1;
				    for(int c=1;c<=x;c++){
				        if(c==1||c==x){
				        System.out.print("*");
				        }else{
				            System.out.print(y);
				            if(c<=x/2){
				                y++;
				            }else{
				                y--;
				            }
				        }
				    }
				    if(r<=n){
				        x +=2;
	
				    }else{
				        x -=2;
				    }		    
				    System.out.println();
				}
			}
		}
        
    }
}