package Scope;
public class MethodScope {
    public static void printS(){
        int s = 4; // scope of variable 's' is only within the printS method
        System.out.println(s);
    }

    public static void main(String args[]){
     //   System.out.println(s); s variable is out of scope for main method to access directly
        printS(); 
    }
}
