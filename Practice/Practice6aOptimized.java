/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * Time complexity is O(n)
 * 
 */

import java.util.*;
public class Practice6aOptimized {
    /**
     * @param integer array nums
     * @return true if any value appears at least twice in the array Otherwise returns false
     **/

    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}; //{1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(nums));
    }
}
