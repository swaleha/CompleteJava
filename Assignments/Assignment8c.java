/*
 * Write a program to Find Transpose of a Matrix.
 * 
 * Transpose of a matrix is the process of swapping the rows to columns. 
 *
 * For a 2x3 matrix,
 *  Matrix:
 *  a11  a12  a13
 *  a21  a22  a23
 *
 *  Transposed Matrix:
 *  a11  a21
 *  a12  a22
 *  a13  a23
 */

public class Assignment8c {

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30},
                          {40, 50, 60}};
        System.out.println("Original matrix: ");
        printMatrix(matrix);

        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];
        System.out.println("Transposed matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);

    }
}
