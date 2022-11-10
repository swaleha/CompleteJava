public class DoWhileLoop {
    public static void main(String args[]){
        int counter = 11;
        do {
            System.out.println("Hello World!"); //do-while loop executes at least once since condition is checked after the loop is executed
            counter++;
        }while(counter <= 10);
    }
}
