package test;

import java.util.Scanner;

public class MyEncryptedString {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input text: ");
		String inputStr = keyboard.nextLine();
		System.out.println("Your input was: " + inputStr);
		
		String encryptedString = encryptString(inputStr);
		System.out.println("Encrypted input: " + encryptedString);
		
		String decryptedString = decryptString(encryptedString);
		System.out.println("Decrypted input: " + decryptedString);

	}
	
	public static String encryptString(String input) {
		
		char[] characters = input.toCharArray();
		for(int i = 0; i < characters.length; i++) {
			int ascii = (int)characters[i];
			ascii += 7;
			if(ascii > 127)
				ascii -= 127;
			
			
			characters[i] = (char)ascii;			
		}
		
		String encryptedInput = new String(characters);
		return encryptedInput;
		
		
//		VERSION 1.0		
//		char[] characters = input.toCharArray();
//		char[] characters2 = new char[characters.length];
//		
//		characters2[characters.length - 2] = characters[0];
//		characters2[characters.length - 1] = characters[1]; 
//
//		for(int i = 2; i < characters.length; i++) {
//			characters2[i - 2] = characters[i];
//		}
//	
//		String encryptedInput = new String(characters2);
//		return encryptedInput;
	}
	
	public static String decryptString(String input) {

		char[] characters = input.toCharArray();
		for(int i = 0; i < characters.length; i++) {
			int ascii = (int)characters[i];
			ascii -= 7;
			if(ascii < 0)
				ascii += 127;
			
			characters[i] = (char)ascii;			
		}
		
		String decryptedInput = new String(characters);
		return decryptedInput;
		
		
//		VERSION 1.0	
//		char[] characters = input.toCharArray();
//		char[] charactersNew = characters;
//		
//		char temp = characters[characters.length - 2];
//		char temp2 = characters[characters.length - 1];
//
//		for(int i = characters.length - 1; i >= 0; i--) {
//			if((i - 2) >= 0) {
//				characters[i] = charactersNew[i - 2];
//			}
//			
//		}
//		characters[0] = temp;
//		characters[1] = temp2;
//		
//		String decryptedInput = new String(characters);
//		return decryptedInput;
	}
}
