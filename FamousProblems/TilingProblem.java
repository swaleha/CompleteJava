/*
 * Tiling Problem: Solved using recursion
 * Given a "2 X n" floor/board and tiles size of "2 X 1",
 * count the number of ways to tile the given board/floor
 * using the 2 X 1 tiles.
 * (A tile can be placed either vertically or horizontally)
 */
public class TilingProblem {
    public static void main(String[] args) {
        System.out.println("Total number of ways of placing tiles on a 2 X N or 4 X N floor/board: " + tiling(4));
    }

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
 
        //vertical tiling
        //int verticalTiles = tiling(n-1);

        //horizontal tiling
        //int horizontalTiles = tiling(n-2);

        //total ways of placing the tiles
        //int totWays = verticalTiles + horizontalTiles;
        //return totWays;
        return tiling(n-1) + tiling(n-2);
    }
}
