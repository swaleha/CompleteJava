/*
 * Time complexity: O(logn)
 */
public class XToThePowerNOptimized {
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }

    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }

        //n is even
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
}
