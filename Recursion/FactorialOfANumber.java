/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 */

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        //base case
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
}
