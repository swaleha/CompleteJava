/*
 * Space complexity: O(n)
 * Time complexity: exponential O(2^n)
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci number " + n + " is : " + fib(n));
    }
    public static int fib(int n){
        //Base case
        if(n == 0 || n == 1){
            return n;
        }

        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

}