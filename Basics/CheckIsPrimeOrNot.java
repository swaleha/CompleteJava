public class CheckIsPrimeOrNot {

    //only for n >= 2
    /**
     * @param n -> input number to check the whether it is prime or not
     * @return true/false -> returns true if the number is prime or false otherwise
     * 
     */
    public static boolean isPrime(int n){

        //corner cases
        if(n == 2){
            return true;
        }

        for(int i=2; i <= n-1; i++){ //completely divides
            if(n % i == 0){
                return false;
            }  
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isPrime(18)); 
    }
}
