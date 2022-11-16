import java.util.*;
public class Assignment5a {

    public static double averageOfThree(double a, double b, double c){
        return (a + b + c)/3;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double a = sc.nextDouble();
        System.out.println("Input the second number: ");
        double b = sc.nextDouble();
        System.out.println("Input the third number: ");
        double c = sc.nextDouble();

        System.out.println("Average of three numbers is " + averageOfThree(a, b, c));
    }
}