/*
 * Solved using recursion
 * Convert a given number (2019) to string (two zero one nine)
 * digits(0-9)
 * last digit cannot be 0
 */
public class Practice12b {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int number) {
        //Base case
        if(number == 0) {
            return;
        }

        //work
        int lastDigit = number % 10;
        printDigits(number/10);
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args) {
        printDigits(1947);
        System.out.println();
    }
}
