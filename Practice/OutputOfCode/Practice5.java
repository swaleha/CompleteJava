package OutputOfCode;
public class Practice5 {
    public static void main(String[] args) {
        for(int j=1; j<=5; j++){
            for(int k=5; k>=j; k--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
