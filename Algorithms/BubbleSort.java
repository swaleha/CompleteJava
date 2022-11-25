public class BubbleSort {

    public static void bubble_sort(int numbers[]){
        for(int i=0; i<numbers.length-1; i++){
            int swaps = 0;
            for(int j=0; j<numbers.length-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }
    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 4, 5};
        bubble_sort(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
