public class FloydTriangleProblem {
    public static void main(String args[]){
        int number = 1;
        for(int line = 1; line <= 5; line++){
            for(int n = 1; n <= line; n++){
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }
    }
}