import java.util.*;
public class DecimalToBinary {
    public static void decToBin(int n){
        int number = n;
        int bin = 0;
        int pow = 0;
        int rem = 0;

        while(n > 0){
            rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
            
        }

        System.out.println("Binary of " + number + " is " + bin);

    }

    public static void main(String args[]){
        decToBin(5);
    }
}
