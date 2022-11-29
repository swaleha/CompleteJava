import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr1(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr1[] = {5, 4, 1, 3, 2};
        int arr2[] = {4, 2, 0, 6, 8};
        Integer arr3[] = {5, 4, 1, 3, 2};
        Integer arr4[] = {2, 4, 8, 6, 9};
        
        Arrays.sort(arr1);
        printArr(arr1);

        //print in sorted order with starting and ending index
        Arrays.sort(arr2, 0, 3);
        printArr(arr2);

        //descending order
        Arrays.sort(arr3, Collections.reverseOrder());
        printArr1(arr3);

        //descending order with starting index and ending index
        Arrays.sort(arr4, 0, 3, Collections.reverseOrder());
        printArr1(arr4);

    }
}
