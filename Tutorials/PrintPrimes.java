public class PrintPrimes {

    public static void printPrimeNumbers(int num){

       for(int i=2; i<=num; i++){
            if(isPrime(num)){       //true
                System.out.println(isPrime(i));
            }
        System.out.println();
       }
        
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= num; i++) {
            if(num % i == 0){       //completely divides
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        printPrimeNumbers(10);
    }
}
