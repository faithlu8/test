package test;

import java.util.Scanner;
import java.util.TreeMap;

public class ValidStackMap {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input text: ");
		String inputStr = keyboard.nextLine();
		System.out.println("Your input was: " + inputStr);
		
		if (isValid(inputStr)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
	}
	public static boolean isValid(String s) {
	
		char[] charArr = s.toCharArray();
	
		java.util.Stack<Character> stack = new java.util.Stack<> ();
				
		TreeMap<Character, Character> bracketMap = new TreeMap<Character, Character>();
		
		bracketMap.put('}', '{');
		bracketMap.put(']', '[');
		bracketMap.put(')', '(');
		
		for(int i = 0; i < charArr.length; i++) {
			
			//is either }, ], or )
			if(bracketMap.containsKey(charArr[i])) {
				if(stack.isEmpty())
					return false;
				if(stack.pop() != bracketMap.get(charArr[i]))
					return false;
			}
			
			//is either {, [, or (
			else {
				stack.push(charArr[i]);
			}
			
		}
		
		if(stack.isEmpty())
			return true;
		return false;
	}
}
