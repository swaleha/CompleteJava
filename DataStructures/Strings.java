import java.util.*;

public class Strings {

    public static void main(String args[]){
    char ch[] = {'a', 'b', 'c', 'd'};
    String str1 = "Hello World";
    String str2 = new String("This is a string");
    System.out.println(str1);
    System.out.println(str2);

    //read input string
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter a string: ");
    //String str3 = sc.next();  //prints only one word
    //System.out.println(str3);

    System.out.println("Enter a two or more words: ");
    String str4 = sc.nextLine(); //prints a line of string
    System.out.println(str4);

    //Strings are immutable -- strings cannot be changed/updated once created. Every change creates a new string

    //String concatenation
    String firstName = "Tony";
    String lastName = "Stark";

    String fullName = firstName + " " + lastName;
    System.out.println(fullName);


    }
}
