// Inplace Heap Sort
// Send Feedback
// Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
// Note: Space complexity should be O(1).
// Input Format:
// The first line of input contains an integer, that denotes the value of the size of the array or N.
// The following line contains N space separated integers, that denote the value of the elements of the array.
// Output Format :
// The first and only line of output contains array elements after sorting. The elements of the array in the output are separated by single space.
// Constraints :
// 1 <= n <= 10^6
// Time Limit: 1 sec
// Sample Input 1:
// 6 
// 2 6 8 5 4 3
// Sample Output 1:
// 8 6 5 4 3 2

public class Solution {

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
        //making heap
        for(int i = 1; i < arr.length; i++){
			int childIndex = i;
            int parentIndex = (childIndex -1) / 2;
            
            while(childIndex > 0){
                if(arr[childIndex] > arr[parentIndex]){
					break;
                }
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
            }
            
        }
        //deleting min
        for(int i = arr.length -1; i >= 0; i--){
			int min = arr[0];
            arr[0] = arr[i];
            arr[i] = min;
            
            int parentIndex = 0;
            int leftChildIndex = 2*parentIndex + 1;
            int rightChildIndex = leftChildIndex + 1;
            while(parentIndex < i){
                int minIndex = parentIndex;
                int minValue = arr[minIndex];
                
                if(leftChildIndex < i){
					int leftChild = arr[leftChildIndex];
                    if(leftChild < minValue){
                        minIndex = leftChildIndex;
                        minValue = arr[minIndex];
                    }
                }
                if(rightChildIndex < i){
					int rightChild = arr[rightChildIndex];
                    if(rightChild < minValue){
                        minIndex = rightChildIndex;
                        minValue = arr[minIndex];
                    }
                }
                if(parentIndex == minIndex){
                    break;
                }else{
                    arr[minIndex] = arr[parentIndex];
                    arr[parentIndex] = minValue;
                    
                }
                parentIndex = minIndex;
                leftChildIndex = 2* parentIndex + 1;
                rightChildIndex = leftChildIndex + 1;
                
            }
        }
		
	}
}