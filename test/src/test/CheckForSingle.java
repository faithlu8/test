package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class CheckForSingle {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input array: ");
		String inputStr = keyboard.nextLine();
				
		inputStr = inputStr.substring(1, inputStr.length() - 1);
		String[] inputStrArr = inputStr.split(", ");
		int[] inputArr = new int[inputStrArr.length];
		
		for(int i = 0; i < inputStrArr.length; i++) {
			inputArr[i] = Integer.parseInt(inputStrArr[i]);
		}
				
		int singleVal = findSingleVal(inputArr);
		
		if(singleVal <= 0)
			System.out.println("Invalid input. Please try again.");
		else
			System.out.println("Value is " + singleVal);
		
	}
	public static int findSingleVal(int[] input) {
		
		//key is number of occurrences, value is single val
//		TreeMap<Integer, List<Integer>> treeMap = new TreeMap<Integer, List<Integer>>(); 
//		
//		List<Integer> singleList = new LinkedList<Integer>();
//		List<Integer> valList = new LinkedList<Integer>();
//		
//		treeMap.put(1, singleList);
//		treeMap.put(2, valList);
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < input.length; i++) {
			if(treeMap.get(input[i]) == null) {
				treeMap.put(input[i], 1);
			}
			else {
				int occurrences = treeMap.get(input[i]);
				occurrences++;
				treeMap.put(input[i], occurrences);
			}
		}
		
		for(int i = 0; i < input.length; i++) {
			if(treeMap.get(input[i]) == 1) {
				return input[i];
			}
		}
		
		return -1;
//		int count = 1;
//		int starter = 0;
//		for(int i = 0; i < input.length; i++) {
//			starter = input[i];
//			System.out.println(starter);
//			for(int j = i + 1; j < input.length; j++) {
//				if(starter == input[j]) {
//					count++;
//					System.out.println(count);
//				}
//			}
//			if(count == 1) {
//				return starter;
//			}
//		}
//		
//		return -1;
		
	}
}
