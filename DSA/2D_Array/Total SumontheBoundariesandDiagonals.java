// Total Sum on the Boundaries and Diagonals
// Send Feedback
// For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
// Input format:
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'N' column values separated by a single space.
// Output format:
// For each test case, print the single integer denoting the sum.

// Output for every test case will be printed in a seperate line.
// Constraints:
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// Time Limit: 1sec
// Sample input 1:
// 1
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1:
// 45
// Explanation for Sample Output 1:
// The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

// The first-diagonal elements are 1, 5 and 9. 

// The second-diagonal elements are 3, 5 and 7.

// We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

// Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
// Sample input 2:
// 2
// 5
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
// 4
// 1 2 3 10
// 4 5 6 11
// 7 8 9 12
// 13 14 15 16
// Sample Output 2:
// 273
// 136


/*public class Solution {

	public static void totalSum(int[][] mat) {
        if(mat.length != 0){
            int i,k = 0;
            int scol = 0;
            int srow = 0;
            int row = mat.length;
            int col = mat[0].length;
            int [] ans = new int[3*(row*col)];
            int sum = 0;

            //for diagonal elements
            for(i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    if(i==j) {
                        ans[k] = mat[i][j];
                        k++;
                    }
                }
            }
            int j;
            for(i = 0, j = col -1; i < row ; i++,j--) {
                        ans[k] = mat[i][j];
                        k++;
            }


            //for boundaries element
            for(i = scol; i < col; ++i) {
                ans[k] = mat[srow][i];
                k++;
            }
            srow++;
            for(i = srow; i < row; ++i) {
               ans[k] = mat[i][col-1];
                k++;
            } 
            col--;
            if(srow < row) {
                for(i = col-1 ; i >= scol; --i ) {
                    ans[k] = mat[row-1][i];
                    k++;
                } 
                row--;
            }        
            if(scol < col) {
                for(i = row -1; i >= srow; --i) {
                    ans[k] = mat[i][scol];
                    k++;
                }
                scol++;
            }
			
            //Assign 0 to the common element
            for( i = 0; i < ans.length; i++) {			
                for(j = 0; j < ans.length; j++) {
                    if(i!=j) {
                        if(ans[i] == ans[j]) {
                            ans[j] = 0;
                        }						
                    }
                }
            }
           
            //Sum of the element
            for(i = 0; i < ans.length; i++) {
                sum += ans[i];
            }
            System.out.println(sum);
        
		}
        else{
            System.out.println(0);
		}
    }

}*/
public class Solution {

	public static void totalSum(int[][] mat) {
		int sum = 0;
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat.length; j++){
                if (i==j || i+j==mat.length-1|| i==0||i==mat.length-1||j==0||j==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }System.out.println(sum);
	}

}