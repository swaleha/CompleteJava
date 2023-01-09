/*
 * swap without using third variable
 */
public class Practice10b {
    public static void main(String[] args) {
        int x=3, y=4;
        System.out.println("Before swap: x = " + x + " y = " + y);
        
        //swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " y = " + y);
    }
}
