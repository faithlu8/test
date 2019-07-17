package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SelfDividingNumbers {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input lower bound: ");
		int lower = keyboard.nextInt();
		System.out.println("Please input upper bound: ");
		int upper = keyboard.nextInt();
		
		System.out.println("Bound: " + lower + " - " + upper);
		
		List<Integer> nums = selfDividingNumbers(lower, upper);
		
		if(nums == null)
			System.out.println("Error, please try again.");
		else
			System.out.println(nums.toString());
		
	}
	public static List<Integer> selfDividingNumbers(int left, int right) {
		
		List<Integer> nums = new LinkedList<Integer>();
		
		if(left > right) {
			int temp = right;
			right = left;
			left = temp;
		}
		
		for(int i = left; i <= right; i++) {
			if(!containsZero(i)) {
				if(isSelfDividingNum(i)) {
					nums.add(i);
				}
			}
		}
		
		return nums;
	}
	public static boolean containsZero(int num) {
		String number = new Integer(num).toString();
		return number.contains("0");
		
		//System.out.println("Number: " + number + " : " + num);
		
		 
	}
	public static boolean isSelfDividingNum(int num) {
		
		char[] nums = (num + "").toCharArray();
		
		//System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++) {
			
			int val = Integer.parseInt(nums[i] + "");
			
			if(num % val != 0) {
				//System.out.println
				return false;
			}
				
		}
		return true;
		
	}
}
