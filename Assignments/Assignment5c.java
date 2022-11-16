import java.util.*;
public class Assignment5c{
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int palindrome = sc.nextInt();
        
        if (isPalindrome(palindrome)) {
            System.out.println("Number: " + palindrome + " is palindrome");
        } else {
            System.out.println("Number:" + palindrome + " is not a palindrome");
        }
        
    }

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        int remainder = 0;
        while (palindrome > 0){
            remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome = palindrome / 10;
            }

            if (reverse == number) {
                return true;
            } 

            return false;
            
       
    }
}