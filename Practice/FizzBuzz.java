/*
 * Program prints:
 * -   Fizz if the number is divisible by 3
 * -   Buzz if the number si divisible by 5
 * -   FizzBuzz if the number is divisible by 3 and 5
 * -   itself if number is not divisible by 3 or 5
 */
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int number = Integer.valueOf(scan.nextLine());
       if(number%3 == 0 && number%5 == 0) {
            System.out.println("FizzBuzz");
       } else if (number%3 == 0) {
            System.out.println("Fizz");
       } else if (number%5 == 0) {
            System.out.println("Buzz");
       } else {
            System.out.println(number);
       }
    }
}