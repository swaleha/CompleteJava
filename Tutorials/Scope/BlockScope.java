package Scope;
public class BlockScope {
    public static void main(String args[]){
        int p = 10;
        //System.out.println(s); // s cannot be accessed because it is 

        {
            int s = 4;
            System.out.println(s); //scope of 's' variable is within this block 
            System.out.println("Accessing 'p' inside the block: "+p); // scope of p variable is throughout the main method after its definition
        }
       // System.out.println(s); //s variable cannot be accessed outside the block
        
       System.out.println("Accessing 'p' in the Main method after its definition:"+ p);

    }
}
