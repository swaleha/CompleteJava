/*
 * Count how many times lower case vowels occurred in a String entered by the user 
 */
import java.util.*;
public class Practice9a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int counter = 0;
        for(int count=0; count<input.length(); count++){
            char ch = input.charAt(count);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                counter++;
            }
        }
        System.out.println("The vowels (a, e, i, o, u) occur " + counter + " times");
        sc.close();
    }
}