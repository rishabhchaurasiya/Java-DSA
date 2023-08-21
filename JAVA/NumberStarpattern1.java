// Number Star pattern 1
// Send Feedback
// Print the following pattern for given number of rows.
// Input format :
// Integer N (Total number of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321

import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int sum;
        
        for(int i=1; i<=n; i++) {
            
            sum = 0;
            
            for(int j=n; j>=1; j--) {

                if(j == i) {
                    System.out.print("*");
                    sum += j;
                } else {
                    System.out.print(j);
                    sum += j;
                }
            
            }
            
            System.out.println();

        }

	}
}
