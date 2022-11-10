import java.util.*;
public class QuestionContinueStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if((number % 10) == 0){
                continue; // continue statement skips printing a number if the user input is a multiple of 10 and continues printing any other number forever.
            } 

            System.out.println("Your number was: " + number);

        }while(true);
    }

}