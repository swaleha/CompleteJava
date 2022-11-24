/*
 * Brute force method is used to find maximum sum of sub arrays.
 * Time complexity of this approach is O(n3) - Big O of n cube
 */

import java.util.*;
public class MaxSumOfSubArray {

    public static void maxSubArrSum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println("Sum of sub-arrays: " + currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of sub-arrays is: " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3}; //{2, 4, 6, 8, 10};
        maxSubArrSum(numbers);
    }
}
