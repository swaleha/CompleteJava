/*
 * Search In Rotated Sorted Array java program
 * Time complexity is O(log n) because for every iteration one half of the array is discarded
 */
public class Practice6b {

    public static int search(int nums[], int target){
        //[4, 5, 6, 7, 0, 1, 2]

        //left and right 
        int left = 0;
        int right = nums.length - 1;

        // handling array is empty corner case
        if(nums == null || nums.length == 0){
            return -1;
        }

        //check the index where array is rotated
        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if(nums[midpoint] > nums[right]){
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }

        int pivot = left;
        left = 0;
        right = nums.length - 1;

        if(target >= nums[pivot] && target <= nums[right]){
            left = pivot;
        } else {  
            right = pivot;
        }
        //perform normal binary search
        while(left <= right){
            int midpoint = left + (right - left) / 2;
            if(nums[midpoint] == target){
                return midpoint;
            } else if(nums[midpoint] < target){
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }

        
    public static void main(String args[]){
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(search(nums, target));
    }
}
