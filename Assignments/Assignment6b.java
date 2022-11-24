public class Assignment6b {

    public static void sort_rotate(int nums[]){
        
    }

    public static int binary_search(int nums[], int target){ 
        int first = 0;
        int last = nums.length - 1;

        while(first <= last){
            int mid = (first + last) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
                last = mid - 1;
            }

            if(target > nums[mid]){
                first = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(binary_search(nums, target));
    }
}
