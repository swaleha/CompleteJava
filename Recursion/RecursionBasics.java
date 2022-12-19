/*
 * Recursion is a method of solving a computational problem
 * where the solution depends on
 * solutions to smaller instances of the same problem
 *
 * Important things for a recursive function:
 * 1. Base case
 * 2. Work
 * 3. inner call
 *
 * Main method() and recursive method() calls are stored in the call stack
 */
public class RecursionBasics {
    public static void main(String[] args) {
        //printDec(10);
        printInc(10);
        System.out.println();
    }


    //printing numbers in decreasing order
    public static void printDec(int n){

        //Base case
        if(n == 1){
            System.out.print("1");
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }

    //printing numbers in increasing order
    public static void printInc(int n){
        //Base case
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        printInc(n-1);
        System.out.print(n + " ");
    }

}
