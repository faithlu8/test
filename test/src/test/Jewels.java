package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Jewels {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input the string of jewels: ");
		String jewels = keyboard.nextLine();
		
		System.out.println("Please input the string of stones: ");
		String stones = keyboard.nextLine();

		int numJewels = numJewelsInStones(jewels, stones);
		
		System.out.println("Output: " + numJewels);
		
		
	}
	public static int numJewelsInStones(String J, String S) {
		
		int jewelCount = 0;
		
		char[] jewelArr = J.toCharArray();
		
		Set<Character> jewelSet = new HashSet<Character>();
		
		for(int i = 0; i < jewelArr.length; i++) {
			jewelSet.add(jewelArr[i]);
		}

		char[] stoneArr = S.toCharArray();
		
		for(int i = 0; i < stoneArr.length; i++) {
			if(jewelSet.contains(stoneArr[i]))
				jewelCount++;			
		}
		
		return jewelCount;
	}
}
