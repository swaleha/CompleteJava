public class LogicalOperators {
    public static void main(String args[]){
        System.out.println((3 > 2) && (1 > 5));
        System.out.println((3 > 2) && (1 < 5));
        System.out.println((3 > 2) || (1 < 5));
        System.out.println((3 < 2) || (1 > 5));
        System.out.println(!(1 < 5));
        System.out.println(!(3 < 2));
    }
}
