public class Assignment5e{

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println("Sum of digits in an integer is: " + sumOfDigits(3895));
    }
}