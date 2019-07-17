package test;

import java.util.LinkedList;
import java.util.List;

public class FlipImage {
	public static void main(String args[]) {
		int[][] matrix = new int[1][3];
		
		for(int i = 0; i < matrix.length; i++) {
		    for(int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int)(Math.random() * 8 + 1);
			}
		}
		
		for(int[] row : matrix) {
			for(int j : row) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] editedMatrix = flipAndInvertImage(matrix);
		
			
		System.out.println();

		
		for(int[] row : editedMatrix) {
			for(int j : row) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public static int[][] flipAndInvertImage(int[][] A) {
        
		for(int[] row : A) {
			row = flipRow(row);
		}
		
		return reverseMatrix(A);
		
    }
	public static int[] flipRow(int[] row) {
		
		List<Integer> tempList = new LinkedList<Integer>();
		
		for(int i : row) {
			tempList.add(i);
		}
		
		for(int j = 0; j < row.length; j++) {
			row[j] = tempList.get(row.length - 1 - j);
		}
		
		return row;
	}
	public static int[][] reverseMatrix(int[][] A) {
		
		List<int[]> rowList = new LinkedList<int[]>();
		for(int[] row : A) {
			rowList.add(row);
		}
		
		for(int j = 0; j < A.length; j++) {
			A[j] = rowList.get(A.length - 1 - j);
		}
		
		return A;
	}
}
