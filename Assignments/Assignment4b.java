/* 
    This program that reads a set of integers, and then prints the sum of the even and odd integers
*/

import java.util.*;
public class Assignment4b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int even_sum = 0;
        int odd_sum = 0; 
        int choice;
        int n;
        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if(n % 2 == 0){
                even_sum += n;
            } else {
                odd_sum += n;
            }
            System.out.println("Do you wish to continue? press 1 to continue and 0 to quit: ");
            choice = sc.nextInt();

        } while(choice == 1);
        System.out.println("Sum of even numbers is: " + even_sum);
        System.out.println("Sum of odd numbers is: " + odd_sum);
        sc.close();
    }
    
}
