package CHAPTER_2;

import java.util.*;

public class ROTATE_2D_ARRAY {
	public static void rotateMatrix(List<List<Integer>> squareMatrix) {
		final int matrixSize = squareMatrix.size() - 1;
		for (int i = 0; i < (squareMatrix.size() / 2); ++i) {
		for (int j = i; j < matrixSize - i; ++j) {
		// Perform a 4-way exchange.
		int tempi = squareMatrix.get(matrixSize - j).get(i);
		int temp2 = squareMatrix.get(matrixSize - i).get(matrixSize - j);
		int temp3 = squareMatrix.get(j).get(matrixSize - i);
		int temp4 = squareMatrix.get(i).get(j);
		squareMatrix.get(i).set(j, tempi);
		squareMatrix.get(matrixSize - j).set(i, temp2);
		squareMatrix.get(matrixSize - i).set(matrixSize - j, temp3);
		squareMatrix.get(j).set(matrixSize - i, temp4);
		}
		}
		System.out.println("After Rotating, The matrix is : ");
		for(int i=0;i<squareMatrix.size();i++) 
		{
		System.out.println(squareMatrix.get(i));
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the matrix : ");
		int s=sc.nextInt();
		System.out.println("Enter the elements : ");
		List<List<Integer>> x = new ArrayList<List<Integer>>();
		for(int i=0;i<s;i++) 
		{
			x.add(new ArrayList<Integer>());
			for(int j=0;j<s;j++)
			{
				int n=sc.nextInt();
				x.get(i).add(j,n);
			}
		}
		System.out.println("The matrix is : ");
		for(int i=0;i<s;i++) 
		{
		System.out.println(x.get(i));
		}
	    rotateMatrix(x);
		
	}

}
