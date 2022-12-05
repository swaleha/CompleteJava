public class SubArrays {

    public static void printSubArrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){ //start
            int start = i;
            for(int j=i; j<numbers.length; j++){ //end
                int end = j;
                for(int k=start; k<=end; k++){ //print
                    System.out.print(numbers[k] +" "); //sub-array
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of sub-arrays is: " +ts);
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}
