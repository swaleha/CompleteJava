/*
 * Time and space complexity is O(n)
 */
public class FirstOccurrence {
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 2, 4, 5, 1};
        int i = 0, key = 5;
        System.out.println(firstOccurrenceOfNumber(arr, i, key));
    }

    public static int firstOccurrenceOfNumber(int arr[], int i, int key){
        //Base case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurrenceOfNumber(arr, i+1, key);
    }
}
