/*
 * Add 1 to an integer using bit manipulation
 * Using Bitwise NOT operator
 *  -x = ~x + 1
 *  -~x = ~(~x) + 1 = x + 1
 */
public class Practice10c {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);

        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);

        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
}
