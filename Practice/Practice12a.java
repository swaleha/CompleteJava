/*
 * Solved using recursion
 * For a given integer array of size N, Find all occurrences (indices)
 * of a given element (Key) and print them.
 */

public class Practice12a {
    public static void allOccurrencesOfKey(int arr[], int key, int i) {
        //Base case
        if(i == arr.length) {
            return;
        }

        //Work
        if(arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurrencesOfKey(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key, i;
        allOccurrencesOfKey(arr, 2, 0);
        System.out.println();
    }
}
