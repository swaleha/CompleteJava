/*
 * Print output
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */
public class Practice3 {
    public static void main(String[] args) {
        for(int i=1; i < 6; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
