package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class MyMap {
	public static void main(String args[]) {
		
		int arraySize = (int)(Math.random() * 10 + 5);
		
		int[] keyArr = new int[arraySize];
		int[] valArr = new int[arraySize];
		
		for(int i = 0; i < arraySize; i++) {
			keyArr[i] = (int)(Math.random() * 10 - 1);
			valArr[i] = (int)(Math.random() * 10 - 1);
		}
		
		System.out.println("Keys: " + Arrays.toString(keyArr));
		System.out.println("Values: " + Arrays.toString(valArr));
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < arraySize; i++) {
			if(!treeMap.containsKey(new Integer(keyArr[i])))
				treeMap.put(keyArr[i], valArr[i]);
					
		}
		
		System.out.println("Key-Value Pairs: ");
		
		for(Integer currentKey : treeMap.keySet()) {
			Integer val = treeMap.get(currentKey);
			System.out.println("[" + currentKey + " : " + val + "]");
		}
		
		System.out.println("Tree Map size: " + treeMap.size());
				
	}
}
