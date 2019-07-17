package test;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) {
		val = x;
	}
	
	TreeNode(int x, TreeNode leftNode, TreeNode rightNode) {
		val = x;
		left = leftNode;
		right = rightNode;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setLeft(TreeNode leftNode) {
		left = leftNode;
	}
	
	public void setRight(TreeNode rightNode) {
		right = rightNode;
	}
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int newVal) {
		val = newVal;
	}
	
	public String toString() {
		return "[" + val + " : " + left + " : " + right + "]";
	}
}
