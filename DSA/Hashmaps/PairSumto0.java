// Pair Sum to 0
// Send Feedback
// Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
// Note: Array A can contain duplicate elements as well.
// Input format:
// The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
// The following line contains N space separated integers, that denote the value of the elements of the array.
// Output format :
// The first and only line of output contains the count of pair of elements in the array which sum up to 0. 
// Constraints :
// 0 <= N <= 10^4
// Time Limit: 1 sec
// Sample Input 1:
// 5
// 2 1 -2 2 3
// Sample Output 1:
// 2
// Explanation
// (2,-2) , (-2,2) will result in 0 , so the answer for the above problem is 2.

import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		int count = 0;
        if(size == 0)
            return count;
        
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			if (map.containsKey(input[i])) {
				int value = map.get(input[i]);
				map.put(input[i], value + 1);
			} else {
				map.put(input[i], 1);
			}
		}

		for (int i = 0; i < input.length; i++) {
             if(input[i]==-input[i]){
                if(map.containsKey(-input[i])){
                    for(int j = map.get(-input[i])-1;j>0;j--){
                        count+=j;
                    }
                }
                 map.put(input[i],0);
                continue;
            }else if (map.containsKey(input[i])&& map.get(input[i])!=0) {
				if (map.containsKey(-input[i]) && map.get(-input[i])!=0) {
					count += map.get(input[i]) * map.get(-input[i]);
					map.put(input[i], 0);
					map.put(-input[i], 0);
				}
			}
		}
		return count;

	}
}