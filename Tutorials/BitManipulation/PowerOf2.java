import java.util.*;
public class PowerOf2 {
    public static boolean isPowerOf2(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPowerOf2(n);
        if(result){
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }
    }
}
