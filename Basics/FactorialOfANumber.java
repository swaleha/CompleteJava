import java.util.*;
public class FactorialOfANumber {

    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of a number is: " +factorial(num));
        
        sc.close();
    
    }
}

