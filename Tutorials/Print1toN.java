import java.util.*;
public class Print1toN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 1;
        while(counter <= number){
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
