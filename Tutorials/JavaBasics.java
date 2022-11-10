import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        //System.out.println("Hello World!");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10;
        // int b = 5;

        // System.out.println(a);
        // System.out.println(b);

        // String name = "Tony Stark";

        // System.out.println(name);

        // a = b;
        // System.out.println(a);

        // byte b = 10; //1 byte [-127 to -128] 256 numbers can be stored
        // System.out.println(b);

        // boolean var = true; // 1 byte; true or false
        // System.out.println(var);

        // char ch = 'A';   //2 bytes  [A-Za-z'@'']
        // System.out.println(ch);

        // short s = 12;    //2 bytes
        // System.out.println(s);

        // int num1 = 20; // 4 bytes [-2B to +2B]
        // System.out.println(num);

        // long num2 = 10000; // 8 bytes 
        // System.out.println(num2);

        // float price = 10.5; //4 bytes
        // System.out.println(price);

        // double cost = 100.739847893; // 8 bytes
        // System.out.println(cost);
        
        //code to add two numbers
        /* 
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
        */
        //Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // double cost = sc.nextDouble();
        // System.out.println(cost);

        // long num = sc.nextLong();
        // System.out.println(num);

        // short s = sc.nextShort();
        // System.out.println(s);

        //Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int product = a * b;
        // System.out.println(sum);
        // System.out.println(product);

        // Scanner sc = new Scanner(System.in);
        // float rad = sc.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);


        //Implicit conversion(widening), type conversion
        // byte -> short -> int -> float -> long -> double

        // Scanner sc = new Scanner(System.in);
        // float number = sc.nextInt();
        // System.out.println(number); 


        //Narrowing conversion or explicit conversion
        Scanner sc = new Scanner(System.in);
        // float a = 12.56;
        // int b = (int) a;
        // System.out.println(b);

       

        // char ch = 'a';
        // int number = ch;
        // System.out.println(number);

        // char a = 'a';
        // char b = 'b';
        // System.out.println(b - a);
        // System.out.println((int)(a));
        // System.out.println((int)(b));

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // System.out.println(a + b + c); //prints integer as output


        // Type promtotion short, byte, char -> int and long, float, double -> double
        
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double answer = a + b + c + d;
        // System.out.println(answer);

        byte b = 5;
        byte a = (byte) (b * 2);
        System.out.println(a);




    } 
}
//boilerplate code