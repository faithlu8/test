package test;

import java.util.Arrays;

public class Target {
	public static void main(String args[]) {
		
		int[] nums = new int[10];
		int target = 15; 
		
		for(int i = 0; i < nums.length; i++) {
			int randomInt = (int)(Math.random() * 10 - 1);					
			nums[i] = randomInt;
		}
		
		System.out.println("Array: " + Arrays.toString(nums));
		System.out.println("Target: " + target);
		
		int[] result = twoSum(nums, target);
		
		if(result != null)
			System.out.println("Resulting indices: " + Arrays.toString(result));
		else
			System.out.println("No two values in the given array add up to the target value.");
		
	}
	public static int[] twoSum(int[] nums, int target) {
				
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if((nums[i] + nums[j]) == target && i != j) {
					return new int[] {i, j};
				}
			}
		}
		
		return null;
		 
		 
	}
		
}

