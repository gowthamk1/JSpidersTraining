package Test;

import java.util.Scanner;

public class Q5 {
	    
	    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows1, int cols1, int cols2) {
	        int[][] result = new int[rows1][cols2];

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                result[i][j] = 0;
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        return result;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows for the first matrix: ");
	        int rows1 = scanner.nextInt();
	        System.out.print("Enter the number of columns for the first matrix: ");
	        int cols1 = scanner.nextInt();
	        int[][] matrix1 = new int[rows1][cols1];
	        System.out.println("Enter the elements of the first matrix:");
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols1; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.print("Enter the number of rows for the second matrix: ");
	        int rows2 = scanner.nextInt();
	        System.out.print("Enter the number of columns for the second matrix: ");
	        int cols2 = scanner.nextInt();
	        int[][] matrix2 = new int[rows2][cols2];
	        System.out.println("Enter the elements of the second matrix:");
	        for (int i = 0; i < rows2; i++) {
	            for (int j = 0; j < cols2; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }
	        if (cols1 != rows2) {
	            System.out.println("Matrix multiplication is not possible with these dimensions.");
	        } else {
	            int[][] result = multiplyMatrices(matrix1, matrix2, rows1, cols1, cols2);

	            System.out.println("The resulting matrix is:");
	            for (int i = 0; i < rows1; i++) {
	                for (int j = 0; j < cols2; j++) {
	                    System.out.print(result[i][j] + " ");
	                }
	                System.out.println();
	            }
	        }

	        scanner.close();
	    }
	}
