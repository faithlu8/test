package test;

import java.util.Scanner;

public class ValidStack {
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
				
		for(int i = 0; i < charArr.length; i++) {
			
			if(charArr[i] == '{' || charArr[i] == '[' || charArr[i] == '(')
				stack.push(charArr[i]);
			
			else {
				if(stack.isEmpty())
					return false;
				
				
				if(charArr[i] == '}' && stack.pop() != '{') 
					return false;
		
				if(charArr[i] == ']' && stack.pop() != '[') 
					return false;
				
				if(charArr[i] == ')' && stack.pop() != '(') 
					return false;

			}
		}
		
		if(stack.isEmpty())
			return true;
		return false;
	}
}
