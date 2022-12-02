/*
 * Primary Diagonal: row == col; i==j
 * Secondary Diagonal: (row+col)== matrix.length-1; (i+j) == (n-1) => j = (n-1-i)
 */

public class MatrixDiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        /* Brute force approach: Time complexity O(n2)

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(i==j){
                    sum += matrix[i][j];
                }

                if(i+j == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }
        */

        for(int i=0; i<matrix.length; i++){
            //Primary Diagonal
            sum += matrix[i][i];

            //Secondary Diagonal
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        System.out.println("Diagonal sum = " + diagonalSum(matrix));
    }
}
