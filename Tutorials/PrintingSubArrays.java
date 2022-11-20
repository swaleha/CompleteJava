/*
 * Time complexity is O(n3) (i.e Big-O of n cube)
 *  Total number of sub-arrays = n*(n+1)/2
 */
public class PrintingSubArrays {
    public static void printSubArr(int numbers[]){
        int ts = 0;

        for(int i=0; i< numbers.length; i++){
            int start = i;
            for(int j=0; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){ //print
                    System.out.print(numbers[k]+ " "); //subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub-arrays is: " + ts);
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArr(numbers);
    }
}
