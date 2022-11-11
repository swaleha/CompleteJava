/*
 * This program finds factorial of any number entered by the user
 */
import java.util.*;
public class Assignment4c {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long fact = 1;
        int number = sc.nextInt();
        if(number < 0){
            System.out.println("Please enter a valid input");
        } else if((number == 0) || (number == 1)) {
            System.out.println("Factorial of 0 or 1 is 1");
        } else {
            for(int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of a number is " + fact);
        }
    }
}
