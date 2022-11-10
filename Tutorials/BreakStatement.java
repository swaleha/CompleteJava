import java.util.*;
public class BreakStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            if((number%10) == 0) {
                break;  //  when user enters a multiple of 10, you break out of the loop
            }
            System.out.println("You entered the number: "+number);
        } while(true);
    }
}
