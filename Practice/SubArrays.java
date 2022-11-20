import java.util.*;
public class SubArrays {

    public static void printSubArrays(int numbers[]){
        int ts = 0;             
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=start; j<numbers.length; j++){
                int end = j; int sum = 0;
                
                
                for(int k=start; k<=end; k++){
        
                    sum = sum + numbers[k];
                    System.out.print("["+ numbers[k] +"]");
                }
                ts++;
                System.out.println("\nSum of sub arrays: " + sum);
                
                if(max_sum < sum){
                    max_sum = sum;
                }
                if(min_sum > sum){
                    min_sum = sum;
                }
            System.out.println(); 
            }
           
        }
         
            System.out.println();
            System.out.println("\nmaximum sum: " + max_sum);
            System.out.println("\nminimum sum: " + min_sum);
          
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}