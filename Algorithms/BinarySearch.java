/*
 * Time complexity - O(logn) 
 * Binary search only works on sorted set of elements
 * 
 */            

public class BinarySearch {

    public static int binary_search(int numbers[], int key){
        int start=0, end=numbers.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[mid]==key){ //found
                return mid;       
            } 
            if(numbers[mid] < key){ //right
                start = mid + 1;
            }

            if(numbers[mid] > key){ //left
                end = mid - 1;
            }
    }

    return -1;

}
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 8;
    
        System.out.println("Key is present at index: " + binary_search(numbers, key));
   } 
}
