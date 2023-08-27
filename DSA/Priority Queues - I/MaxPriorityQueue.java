// Code : Max Priority Queue
// Send Feedback
// Implement the class for Max Priority Queue which includes following functions -


// 1. getSize -
// Return the size of priority queue i.e. number of elements present in the priority queue.


// 2. isEmpty -
// Check if priority queue is empty or not. Return true or false accordingly.


// 3. insert -
// Given an element, insert that element in the priority queue at the correct position.


// 4. getMax -
// Return the maximum element present in the priority queue without deleting. Return -Infinity if priority queue is empty.


// 5. removeMax -
// Delete and return the maximum element present in the priority queue. Return -Infinity if priority queue is empty.


// Note : main function is given for your reference which we are using internally to test the class.


import java.util.ArrayList;
public class PQ {
    private ArrayList<Integer> heap;
    
    public PQ(){
        heap = new ArrayList<Integer>();
    }
	// Complete this class
	boolean isEmpty() {
		// Implement the isEmpty() function here
        return heap.size() == 0;
	}

	int getSize() {
		// Implement the getSize() function here
        return heap.size();
	}

	int getMax() {
		// Implement the getMax() function here
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
	}

	void insert(int element) {
		// Implement the insert() function here
        heap.add(element);
        int childIndex = heap.size() -1;
        int parentIndex = (childIndex - 1) / 2;
        
        while(childIndex > 0){
            if(heap.get(childIndex) > heap.get(parentIndex)){
                int temp  = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
                
            }else{
                return;
            }
        }
	}

	int removeMax() {
		// Implement the removeMax() function here
    	if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int ans = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        
        int index = 0;
        int maxIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;
        
        while(leftChildIndex < heap.size()){
			if(heap.get(leftChildIndex) > heap.get(maxIndex)){
                maxIndex = leftChildIndex;
            }
            if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)){
                maxIndex = rightChildIndex;
            }
            if(maxIndex == index){
                break;
            }
            else{
                int temp = heap.get(index);
                heap.set(index, heap.get(maxIndex));
                heap.set(maxIndex, temp);
                index = maxIndex;
                leftChildIndex = 2*index + 1;
                rightChildIndex = 2*index + 2;
            }
        }
        return ans;
        
	}
}

