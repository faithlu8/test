package test;

public class ListNode {
	int val;
	ListNode next;
	
	ListNode(int x) {
		val = x;
	}
	
	ListNode(int x, ListNode nextNode) {
		val = x;
		next = nextNode;
	}
	
	public void setNext(ListNode nextNode) {
		next = nextNode;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public int getValue() {
		return val;
	}
	
}
