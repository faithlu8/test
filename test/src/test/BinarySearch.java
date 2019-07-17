package test;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		
   		int[] arr = {0, 3, 17, 55, 71, 82, 83, 94, 99};
		
   		System.out.println("Generated array: " + Arrays.toString(arr));
		
   		int val = 1;
   		
		int index = binarySearchIt(arr, val);
		//int index2 = binarySearchRec(arr, val, 0, arr.length - 1);
		

		System.out.println("Found " + val + " at index " + index + " using Binary Search (iterative).");

		
		//System.out.println("Found " + val + " at index " + index2 + " using Binary Search (recursive).");
		
		
	}
	public static int binarySearchIt(int[] arr, int val) {
		int mid = arr.length / 2;
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			
			if(arr[mid] < val) 
				low = mid + 1;     
		   
			else if ( arr[mid] == val )
		        return mid;  
		    
			else
		    	  high = mid - 1;  
		       
		    mid = (low + high)/2;  
		}
		
		if(low > high)  
			return -1; 
		return mid; 		
	}
	public static int binarySearchRec(int[] arr, int val, int low, int high) {
		int mid = low + (high - low) / 2;
	
		if(val == arr[mid])
			return mid;
		
		if(high <= low)
			return -1;
		
		else if(val > arr[mid]) 
			return binarySearchRec(arr, val, mid + 1, high);
		
		else 
			return binarySearchRec(arr, val, low, mid - 1);
		
	}
}
