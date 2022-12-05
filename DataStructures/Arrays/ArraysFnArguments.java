public class ArraysFnArguments {

    public static void update(int marks[], int nonChangeable){
        for(int i=0; i<marks.length; i++){
            nonChangeable = 10; 
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;
        update(marks, nonChangeable);

        //print and check if marks array is updated
        //values in the array were updated Java follows pass by reference only for arrays
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //Update method couldn't alter the value because java follows pass by value for all parameter variable values except arrays
        System.out.println("nonChangeable variable : "+nonChangeable);

    }
}
