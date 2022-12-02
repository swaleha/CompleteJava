/*
 * Time complexity is O(n+m)
 * In extreme cases where -
 *      1). n>>m, time complexity is O(n)
 *      2). m>>n, time complexity is O(m)   
 * 
 * Logic: Two ways to solve the problem
 * 1. (0, m-1)     
 *      key < cell_value
 *          move LEFT
 *      key > cell_value
 *          move BOTTOM
 * 2. (n-1, 0)
 *      key < cell_value
 *          move TOP
 *      key > cell_value
 *          move RIGHT
 */ 

public class StairCaseSearch {

    public static Boolean searchInSortedMatrix(int matrix[][], int key){
        

        //Approach 2:
        int row = matrix.length-1, col = 0;

        while(row >= 0 && col < matrix[0].length){
            if(key == matrix[row][col]){
                System.out.println("Key is found at (" + row + ", " + col +")");
                return true;
            } else if(key < matrix[row][col]){
                row--;
            } else if(key > matrix[row][col]){
                col++;
            }        
        }
        return false;
            
/** Approach 1: //key = 33
            int row = 0, col = matrix[0].length-1;

            while(row < matrix.length && col >= 0){
                if(key == matrix[row][col]){
                 System.out.println("Key is found at (" + row + ", " + col +")");
                 return true;
            } else if(key < matrix[row][col]){
                col--;
            } else if(key > matrix[row][col]){
                row++;
            }
        }
        return false; 
**/
}
    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 20; //33;
        searchInSortedMatrix(matrix, key);
        
    }
}
