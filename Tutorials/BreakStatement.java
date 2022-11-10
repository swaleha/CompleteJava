public class BreakStatement {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break; //breaks out of the loop (or stops loop execution) when the value of i becomes 3 
            }
            System.out.println(i);
        }
    }
}
