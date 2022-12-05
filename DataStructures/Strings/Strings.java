import java.util.*;
public class Strings {

    public static void printLetters(String fullName){
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }

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

    System.out.println("Enter two or more words in a string: ");
    String str4 = sc.nextLine(); //prints a line of string
    System.out.println(str4);

    //Strings are immutable -- strings cannot be changed/updated once created. Every change creates a new string

    //String concatenation
    String firstName = "Tony";
    String lastName = "Stark";

    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    //Length() function returns number of characters in a string (i.e string length)

    System.out.println("Length of " + fullName + " string is: " + fullName.length());

    //charAt(i) -> This function returns character at the index in the String
    System.out.println("First letter in the word " + fullName + " is: " + fullName.charAt(0));

    //print letters in a string
    printLetters(fullName);

    }
}
