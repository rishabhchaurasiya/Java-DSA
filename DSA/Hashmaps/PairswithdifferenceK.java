// Pairs with difference K
// Send Feedback
// You are given with an array of integers and an integer K. You have to find and print the count of all such pairs which have difference K.
// Note: Take absolute difference between the elements of the array.
// Input Format:
// The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol n.
// The following line contains n space separated integers, that denote the value of the elements of the array.
// The following line contains an integer, that denotes the value of K.
// Output format :
// The first and only line of output contains count of all such pairs which have an absolute difference of K. 
// Constraints :
// 0 <= n <= 10^4
// Time Limit: 1 sec
// Sample Input 1 :
// 4 
// 5 1 2 4
// 3
// Sample Output 1 :
// 2
// Explanation
// (5,2) and (1,4) are the possible combinations as their absolute difference is 3.
// Sample Input 2 :
// 4
// 4 4 4 4 
// 0
// Sample Output 2 :
// 6

import java.util.*;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		// Write your code here
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {

				map.put(arr[i], 1);

			} else {
				int oldfreq = map.get(arr[i]);
				map.put(arr[i], oldfreq + 1);

			}
		}
		if (k == 0) {
			for (int i = 0; i < arr.length; i++) {
				int freq = map.get(arr[i]);
				if (freq > 1) {
					for (int j = 0; j < (freq * (freq - 1)) / 2; j++) {
						count++;

					}

				}
				map.put(arr[i], 0);
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i] + k)) {
					int freq1 = map.get(arr[i]);
					int freq2 = map.get(arr[i] + k);
					for (int j = 0; j < freq1 * freq2; j++) {
						count++;

					}

				}
				if (map.containsKey(arr[i] - k)) {
					int freq1 = map.get(arr[i]);
					int freq2 = map.get(arr[i] - k);
					for (int j = 0; j < freq1 * freq2; j++) {
						count++;
					}
				}
				map.put(arr[i], 0);
			}
		}
		return count;
	}
}