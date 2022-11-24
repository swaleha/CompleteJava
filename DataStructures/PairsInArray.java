/*
 * Time complexity - O(n2) or Big-O of n square
 * Total number of pairs = n * (n - 1) / 2
 */

public class PairsInArray {
    public static void printPairs(int numbers[]){
        int tp = 0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + " , " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }

    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 4, 5};
        printPairs(numbers);
    }
}
