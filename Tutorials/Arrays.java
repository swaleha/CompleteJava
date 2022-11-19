import java.util.*;
public class Arrays {
    public static void main(String args[]){
        int numbers[] ={1, 2, 3};
        String fruits[] = {"Apple", "Mango", "Strawberry", "Orange"};
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Physics marks: ");
        marks[0] = sc.nextInt();
        System.out.println("Input Chemistry marks: ");
        marks[1] = sc.nextInt();
        System.out.println("Input Math marks: ");
        marks[2] = sc.nextInt();

        //updating arrays
        marks[2] = marks[2] + 1;

        System.out.println("Your updated Math marks: " +marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Your percentage is " + percentage +"%");
        System.out.println("Length of marks array is : " +marks.length);
        System.out.println("Length of numbers array is: "+numbers.length);
        System.out.println("Length of fruits array is: "+fruits.length);
    }
}
