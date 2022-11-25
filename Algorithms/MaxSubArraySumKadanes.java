/*
 * Time complexity is O(n)
 * 
 * Kadane's algorithm returns 0 if current sub-array sum has negative value or is less than 0
 *
 */

import java.util.*;
public class MaxSubArraySumKadanes {

    public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0, count 0;
        for(int i=0; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        //System.out.println("current sum: " + currSum);

  /** kadane's algorithm to calculate maximum sum of arrays containing only negative elements  
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]< 0){
                currSum += numbers[i];   
            } 
            maxSum = Math.max(currSum, maxSum);
        }
**/

        System.out.println("Maximum sum of sub-arrays is: " + maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
