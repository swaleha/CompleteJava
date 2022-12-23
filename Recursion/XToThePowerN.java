/*
 * print x to the power n
 * Time complexity is O(n)
 */

public class XToThePowerN {
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
    public static int power(int x, int n){
        //Base case
        if(n == 0){
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * power(x, n-1);
        // return xn;

        return x * power(x, n-1);
    }
}
