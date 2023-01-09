/*
 * Even or Odd using bitwise operators
 */

import java.util.*;
public class EvenOrOdd {
    public static void isEvenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is a even number");
        } else {
            System.out.println(n + " is a odd number");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        isEvenOrOdd(n);
        sc.close();
    }
}
