import java.util.*;
public class IsPrimeOrNotOptimized {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number == 2){
            System.out.println("2 is prime");
        } else {
            for(int i = 2; i <= Math.sqrt(number); i++){
                if((number % i) == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
            sc.close();
        }
    }
}
