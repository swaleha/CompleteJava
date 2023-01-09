package ControlStructures;
public class ContinueStatement {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;   //continue statement skips the value i = 3 and continues printing the next numbers/values of i until the end of the loop.
            }
            System.out.println(i);
        }
    }
}
