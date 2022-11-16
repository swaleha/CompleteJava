public class Assignment5b {
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        System.out.println("The number is even: "+ isEven(0));
    }
}
