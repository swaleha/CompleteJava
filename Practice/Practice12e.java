/* 
 * Solved using recursion
 * Time complexity: (2^n)
 * 
 * Rules:
 * 1. Only one disk can be moved at a time.
 * 2. Top-most disk can only be moved
 * 3. Larger disk cannot be placed on top of a smaller disk
 */

public class Practice12e {
    /*
     * n - number of disks
     * src - source rod
     * dest - destination rod
     * helper - auxillary/helper rod
     */
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        //Base case
        if(n == 1) {
            System.out.println("transfer disk " + n + " from source " + src + " to destination " + dest);
            return;
        }

        //work
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from source " + src + " to destination " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, "S", "H", "D");
    }
}
