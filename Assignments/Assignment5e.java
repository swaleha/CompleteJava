import java.util.*;
public class Assignment5e{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int digits = sc.nextInt();  
        System.out.println("Sum of digits in an integer is: " + sumOfDigits(digits));
    }
    
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
}