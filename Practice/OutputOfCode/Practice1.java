public class Practice1 {
    public static void main(String args[]){
        int count = 1;
        while(count <= 15){
            System.out.println(count % 2 == 1 ? "***" : "+++++");
            ++count;
        }
        System.out.println("Hello world!");
        System.out.println("... and the universe!");
    }
}
