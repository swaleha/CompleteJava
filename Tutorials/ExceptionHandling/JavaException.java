/*
 * Exception: When error occurs, Java stop the code execution and generates an error message. This is called Exception
 * try - This statement allows us to define a block of code to test for errors during execution
 * catch - This statement allows us to define a block of code, if error occurs in the try block (i.e. Used to catch exceptions)
 * finally - executes after the 'try - catch' block regardless of the result.
 * throw - This statement allows us to create a custom error
 */

public class JavaException {
    public static void main(String[] args) {

        try {
        int myNumbers[] = {1, 2, 4};
        System.out.println(myNumbers[10]);  //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        } catch (Exception e){
            System.out.println("Something went wrong: " + e);
        }
        finally {
            System.out.println("The 'try catch' is finished");
        }

        System.out.println("\n*********************************\n");
        checkAge(0);    //checkAge(20);
    }

    static void checkAge(int age){
        if(age < 18) {
           throw new ArithmeticException("Access Denied - you must be at least 18 years old ");
        } else {
            System.out.println("Access Granted - you are old enough!");
        }
    }
}
