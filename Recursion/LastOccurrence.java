/*
 * Time and space complexity is O(n)
 */
public class LastOccurrence {
    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5};         //{8, 3, 6, 9, 5, 10, 2, 5, 7};                                    // arr[] = {5, 5, 5, 5};
        System.out.println(lastOccurrenceOfNumber(arr, 0, 5));
    }

    public static int lastOccurrenceOfNumber(int arr[], int i, int key){
        //Base Case
        if(i == arr.length){
            return -1;
        }

        //Look forward
        System.out.println("I = " + i);
        int isFound = lastOccurrenceOfNumber(arr, i+1, key);

        //check with self
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}
