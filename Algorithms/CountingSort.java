import java.util.*;
public class CountingSort {
    public static void basicCountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];

        //number of times an element/digit occurs (i.e frequency) is stored in a count array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting: by decreasing the elements from count array and adding them to the original array
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
                System.out.println("count array: " + i + " " + count[i]);
            }
        } 
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        basicCountingSort(arr);
        printArr(arr);

    }
}
