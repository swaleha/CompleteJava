public class PrintReverseOfNumber{
    public static void main(String args[]){
        int n = 100891;
        int last_digit;
        while(n > 0) {
            last_digit = n % 10;
            System.out.print(last_digit + " ");
            n /= 10;
        }
        System.out.println();
    }
}