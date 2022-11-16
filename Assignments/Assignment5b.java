import java.util.*;
public class Assignment5b {
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd: ");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
