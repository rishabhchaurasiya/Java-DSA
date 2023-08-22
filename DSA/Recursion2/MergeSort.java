// Merge Sort - Problem Statement
// Send Feedback
// You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.


// You must sort the elements between 'l' and 'r'.


// Note:
// Change in the input array itself. So no need to return or print anything.
// Example:
// Input: ‘N’ = 7,
// 'ARR' = [2, 13, 4, 1, 3, 6, 28]

// Output: [1 2 3 4 6 13 28]

// Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
// Input format :
// The first line contains an integer <em>**'N'**</em> representing the size of the array/list.

// The second line contains 'N' single space-separated integers representing the elements in the array/list.
// Output format :
// You don't need to return anything. In the output, you will see the array after you do the modification.
// Sample Input 1:
// 7
// 2 13 4 1 3 6 28
// Sample Output 1:
// 1 2 3 4 6 13 28
// Explanation of Sample Output 1:
// After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
// Sample Input 2:
// 5
// 9 3 6 2 0
// Sample Output 2:
// 0 2 3 6 9
// Explanation of Sample Output 2:
// After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
// Constraints :
// 1 <= N <= 10^3
// 0 <= ARR[i] <= 10^9

public class solution {

	public static void mergeSort(int[] input){
        if(input.length<=1)
            return ;
        int mid=input.length/2;
        int[] part1=new int[mid];
        int [] part2=new int[input.length-mid];
        for(int i=0;i<mid;i++)
        {
            part1[i]=input[i];
            
        }
        int k=0;
        for(int i=mid;i<input.length;i++)
        {
            part2[k]=input[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(input,part1,part2);
    }
    private static void merge(int[] input,int part1[],int part2[])
    {
        int i=0,j=0,k=0;
        while( i<part1.length&& j<part2.length)
        {
            if(part1[i]<part2[j])
            {
                input[k]=part1[i];
                k++;
                j++;
                
            }
        }
        while(i<part1.length)
        {
            input[k]=part1[i];
            k++;
            i++;
        }
        while(j<part2.length)
        {
            input[k]=part2[j];
            k++;
            j++;
        }
    }
}
		// Write your code here
		
	

