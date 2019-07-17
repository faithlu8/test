package test;

import java.util.Arrays;

public class Sorts2 {
	public static void main(String args[]) {
		
		int[] arr = new int[12];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 9 + 1);
		}
		
		System.out.println("Randomly generated array (unsorted): " + Arrays.toString(arr));
		
		System.out.println("Selection sorted: " + Arrays.toString(selSort(arr)));
		System.out.println("Insertion sorted: " + Arrays.toString(insSort(arr)));
		System.out.println("Bubble sorted: " + Arrays.toString(bubSort(arr)));		
		System.out.println("Merge Sorted: " + Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
		System.out.println("Quick Sorted: " + Arrays.toString(quickSort(arr, 0, arr.length - 1)));

	}
	
	public static int[] selSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = findMinIndex(i, arr);
			swap(arr, i, minIndex);
		}
		return arr;
	}
	public static int findMinIndex(int start, int[] arr) {
		int minIndex = start;
		for(int i = start; i < arr.length; i++) {
			if(arr[minIndex] > arr[i])
				minIndex = i;
		}
		return minIndex;
	}
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static int[] insSort(int[] arr) {
		int j;
		for(int i = 0; i < arr.length; i++) {
			j = i - 1;
			while(j >= 0 && arr[i] < arr[j]) {
				swap(arr, i, j);
				j--;
			}
		}
		return arr;		
	}
	public static int[] bubSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr [i - 1])
				swap(arr, i, i - 1);
		}
		return arr;
	}
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int middle = (low + high) / 2;
			mergeSort(arr, middle + 1, high);
			mergeSort(arr, low, middle);
			
			merge(arr, low, middle, high);
		}
		return arr;
	}
	public static void merge(int[] arr, int low, int middle, int high) {
		int[] helper = new int[arr.length];
		for(int i = low; i <= high; i++) {
			helper[i] = arr[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while(i <= middle && j <= high) {
			if(helper[i] < helper[j]) {
				arr[k] = helper[i];
				i++;
			}
			else {
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while(i <= middle) {
			helper[k] = arr[i];
			i++;
			k++;
		}
		
		
		
	}
	public static int[] quickSort(int[] arr, int low, int high) {
		
		if(low < high) {
			int partition = partition(arr, low, high);
			
			quickSort(arr, low, partition - 1);
			quickSort(arr, partition + 1, high);
		}
		return arr;
	}
	public static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		
		int i = low - 1;
		
		for(int j = low; j <= high - 1; j++) {
			
			if(arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
		
	}
	
}
