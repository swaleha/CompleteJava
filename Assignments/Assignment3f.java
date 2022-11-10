import java.util.*;
public class Assignment3f {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100) == 0) && ((year % 400) == 0);

        if (x && (y || z)){
            System.out.println("It's a leap year: "+year);
        } else {
            System.out.println("It's not a leap year: "+year);
        }
    }
}
