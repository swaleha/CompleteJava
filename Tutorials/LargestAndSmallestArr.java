import java.util.*;
public class LargestAndSmallestArr {

    public static int largest_smallest(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity because any value from the array will be larger than this 
        int smallest = Integer.MAX_VALUE; //+infinity because any value from the array will be smaller than this value
    
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }

            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest value in the array is: " + smallest);
        return largest;

    }
    public static void main(String args[]){
        int numbers[] ={1, 2, 6, 3, 5};
        int largest = largest_smallest(numbers);
        System.out.println("Largest value in the array is : " + largest);
        
    }
}
