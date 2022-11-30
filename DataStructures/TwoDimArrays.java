import java.util.*;
public class TwoDimArrays {

    public static void largestSmallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }

                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element in the matrix is: " + largest);
        System.out.println("Smallest element in the matrix is: " + smallest);

    }

    public static boolean search(int matrix[][], int key){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i + " , " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;          //rows
        int m = matrix[0].length;       //columns

        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){         //For each row
            for(int j=0; j<m; j++){     //columns within a row
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println("Matrix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //search for a key
        search(matrix, 8);
        largestSmallest(matrix);
    }
}
