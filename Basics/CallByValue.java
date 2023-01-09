public class CallByValue {
    public static void swap(int a, int b) {
        a = 10;
        b = 5;

        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String args[]){
        int a = 2;
        int b = 3;
        swap(a, b); // Call by value in Java: Copy of values a and b is sent to the function (swap()) instead of sending the original value
        System.out.println("Value of a: " + a); 
        System.out.println("Value of b: " + b);

    }
}
