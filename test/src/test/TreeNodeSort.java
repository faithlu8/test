package test;

import java.util.Arrays;

public class TreeNodeSort {
	public static void main(String args[]) {
		
		TreeNode root = new TreeNode((int)(Math.random() * 8 + 1), null, null);;
		
		int sum = root.getVal();
		
		System.out.println(root.getVal());
		
		for(int i = 1; i < 5; i++) {
			int currentVal = (int)(Math.random() * 8 + 1);
			System.out.println(currentVal);

			addNode(root, new TreeNode(currentVal, null, null));			
			sum += currentVal;
		}
		
		int sum2 = sumNodes(root);
		
		System.out.println(sum);
		System.out.println(sum2);
		
		
	}
	public static void addNode(TreeNode root, TreeNode addedNode) {
		if(root.getVal() > addedNode.getVal()) {
			if(root.getLeft() == null) {
				root.setLeft(addedNode);
				return;
			}
		
			else {
				addNode(root.getLeft(), addedNode);
				return;
			}
		}
		
		else {
			if(root.getRight() == null) {
				root.setRight(addedNode);
				return;
			}
		
			else {
				addNode(root.getRight(), addedNode);
				return;
			}
		}
	}
	public static int sumNodes(TreeNode root) {
		int sum = root.getVal();
		
		if(root.getLeft() != null && root.getRight() != null)
			return sum + sumNodes(root.getLeft()) + sumNodes(root.getRight());
		
		else if(root.getLeft() != null)
			return sum + sumNodes(root.getLeft());
		
		else if(root.getRight() != null)
			return sum + sumNodes(root.getRight());
		
		return sum;
	}
}
