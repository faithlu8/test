package test;

import java.util.Arrays;

public class Sorts {
	public static void main(String args[]) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 9 + 1);
		}
		
		System.out.println("Randomly generated array (unsorted): " + Arrays.toString(arr));
		
		System.out.println("Selection sorted: " + Arrays.toString(selSort(arr)));
		System.out.println("Insertion sorted: " + Arrays.toString(insSort(arr)));
		System.out.println("Bubble sorted: " + Arrays.toString(bubSort(arr)));		
	}
	
	public static int[] selSort(int[] arr) {
		
		
		int minIndex;
		for(int i = 0; i < arr.length; i++) {
			minIndex = findMinIndex(arr, i);
			swap(arr, i, minIndex);
		}
	    

		return arr;
		
	}
	public static int findMinIndex(int[] arr, int start) {

		int minIndex = start;
	
		for(int i = start; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
	public static int[] insSort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int j = i - 1;
			while(j >= 0 && arr[i] < arr[j]) {
				swap(arr, i, j);
				j--;
			}
		}
		return arr;
		
	}
	public static int[] bubSort(int[] arr) {
		

		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i + 1] < arr[i]) {
				swap(arr, i + 1, i);
			}
		}      

		return arr;
	}
}
