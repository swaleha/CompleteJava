

public class Assignment5c{

    public static boolean isPalindrome(int n){
        int myNum = n;
        int rev = 0;
        int rem = 0;
        while (n > 0){
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n /10;
            }

        if (rev == myNum) {
            return true;
        } else {
            return false;
        }
       
    }
    
    public static void main(String args[]){
        
        System.out.println(isPalindrome(1232));
        
    }
}