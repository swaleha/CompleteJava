/*
 * Recursion is a method of solving a computational problem
 * where the solution depends on
 * solutions to smaller instances of the same problem
 *
 * Important things for a recursive function:
 * 1. Base case
 * 2. Work
 * 3. inner call
 */
public class RecursionBasics {
    public static void main(String[] args) {
        printDec(10);
        System.out.println();
    }

    public static void printDec(int n){

        //Base case
        if(n == 1){
            System.out.print("1");
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }
}
