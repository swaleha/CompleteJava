/*
 * Recursive function to find length of a string
 */
public class Practice12c {
    public static int findStrLength(String str) {
        //Base case
        if(str.length() == 0) {
            return 0;
        }

        //Work
        return findStrLength(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "helloworld!";
        System.out.println(findStrLength(str));
    }
}
