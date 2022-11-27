/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * Time complexity - O(n2)
 */

public class Assignment6a {
    public static boolean containsDuplicate(int num[]){
        for(int i=0; i<num.length - 1; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] == num[j]){
                    return true;
            }
        }
    }
    return false;
}
    public static void main(String args[]){
        int num[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(num));
    }
}
