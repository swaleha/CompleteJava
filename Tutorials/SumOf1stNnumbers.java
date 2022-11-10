import java.util.*;
public class SumOf1stNnumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0; //iterator

        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}
