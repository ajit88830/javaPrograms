package ARRAY;

import java.util.Scanner;

public class MatrixOperation {

      // Method to input matrix elements
      public static int[] inputMatrix(int rows, int cols){
        Scanner sc = new Scanner(System.in);
        int[] matrix = new int[rows * cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i * cols + j] = sc.nextInt(); // Mapping 2D index to 1D array
            }          
        }
    
        return matrix;
        
    }
    

    // Method to display matrix from 1D array
    public static void displayMatrix(int[] matrix, int rows, int cols) {
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i * cols + j] + "\t");
            }
          
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[] addMatrices(int[] matrix1, int[] matrix2, int rows, int cols) {
        int[] result = new int[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i * cols + j] = matrix1[i * cols + j] + matrix2[i * cols + j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[] multiplyMatrices(int[] matrix1, int[] matrix2, int rows1, int cols1, int rows2, int cols2) {
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
            return null;
        }
        int[] result = new int[rows1 * cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i * cols2 + j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i * cols2 + j] += matrix1[i * cols1 + k] * matrix2[k * cols2 + j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[] transposeMatrix(int[] matrix, int rows, int cols) {
        int[] result = new int[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j * rows + i] = matrix[i * cols + j];
            }
        }
        return result;
    }

    // Main method with menu-driven options
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMatrix Operations Menu:");
            System.out.println("1. Add Matrices");
            System.out.println("2. Multiply Matrices");
            System.out.println("3. Transpose Matrix");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    // Matrix Addition
                    System.out.print("Enter number of rows: ");
                    int rows = sc.nextInt();
                    System.out.print("Enter number of columns: ");
                    int cols = sc.nextInt();

                    int[] matrix1 = inputMatrix(rows, cols);
                    int[] matrix2 = inputMatrix(rows, cols);

                    System.out.println("Matrix 1:");
                    displayMatrix(matrix1, rows, cols);

                    System.out.println("Matrix 2:");
                    displayMatrix(matrix2, rows, cols);

                    int[] resultAdd = addMatrices(matrix1, matrix2, rows, cols);
                    System.out.println("Result of Matrix Addition:");
                    displayMatrix(resultAdd, rows, cols);
                    break;
                }
                case 2: {
                    // Matrix Multiplication
                    System.out.print("Enter number of rows for first matrix: ");
                    int rows1 = sc.nextInt();
                    System.out.print("Enter number of columns for first matrix: ");
                    int cols1 = sc.nextInt();

                    System.out.print("Enter number of rows for second matrix: ");
                    int rows2 = sc.nextInt();
                    System.out.print("Enter number of columns for second matrix: ");
                    int cols2 = sc.nextInt();

                    if (cols1 != rows2) {
                        System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
                        break;
                    }

                    int[] matrix1 = inputMatrix(rows1, cols1);
                    int[] matrix2 = inputMatrix(rows2, cols2);

                    System.out.println("Matrix 1:");
                    displayMatrix(matrix1, rows1, cols1);

                    System.out.println("Matrix 2:");
                    displayMatrix(matrix2, rows2, cols2);

                    int[] resultMul = multiplyMatrices(matrix1, matrix2, rows1, cols1, rows2, cols2);
                    if (resultMul != null) {
                        System.out.println("Result of Matrix Multiplication:");
                        displayMatrix(resultMul, rows1, cols2);
                    }
                    break;
                }
                case 3: {
                    // Matrix Transpose
                    System.out.print("Enter number of rows for matrix: ");
                    int rows = sc.nextInt();
                    System.out.print("Enter number of columns for matrix: ");
                    int cols = sc.nextInt();

                    int[] matrix = inputMatrix(rows, cols);

                    System.out.println("Original Matrix:");
                    displayMatrix(matrix, rows, cols);

                    int[] resultTranspose = transposeMatrix(matrix, rows, cols);
                    System.out.println("Transposed Matrix:");
                    displayMatrix(resultTranspose, cols, rows);
                    break;
                }
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    
    }
   
}