package test;

import java.util.Scanner;

public class LowerCase {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input string: ");
		String str = keyboard.nextLine();
		
		System.out.println("Output: " + toLowerCase(str));
		
	}
	public static String toLowerCase(String str) {
		char[] strArr = str.toCharArray();
		
		for(int i = 0; i < strArr.length; i++) {
			if((int)strArr[i] <= 90 && (int)strArr[i] >= 65) {
				strArr[i] = (char)((int)strArr[i] + 32);
			}
		}
		
		return new String(strArr);
		
	}
}
