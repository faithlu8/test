package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input list: ");
		String inputStr = keyboard.nextLine();
		
		System.out.println("Your input was: " + inputStr);
		
		inputStr = inputStr.substring(1, inputStr.length() - 1);
		String[] inputStrArr = inputStr.split(", ");
		
		
		ListNode inputHead = null;
		
		for(int i = inputStrArr.length - 1; i >= 0; i--) {
			inputHead = new ListNode(Integer.parseInt(inputStrArr[i]), inputHead);
			
		}
		
		//ListNode reversedList = reverseList(inputHead, null);
		ListNode reversedList = reverseListRecursive(inputHead, null);
		
		System.out.print(reversedList.getValue());
		
		reversedList = reversedList.getNext();
		
		while(reversedList != null) {
			System.out.print(", " + reversedList.getValue());
			reversedList = reversedList.getNext();
		}
					   
	}
	public static ListNode reverseList(ListNode head) {
		
		ListNode reversed = null;
				
		while(head != null) {
			reversed = new ListNode(head.getValue(), reversed);
			head = head.getNext();
		}
		
		return reversed;
	}
	
	public static ListNode reverseListRecursive(ListNode head, ListNode reversedHead) {
		
		if(head == null)   
			return reversedHead;
	
		reversedHead = new ListNode(head.getValue(), reversedHead);
		return reverseListRecursive(head.getNext(), reversedHead);
		
	}
}
