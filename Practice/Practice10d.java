/*
 * Convert uppercase letters to lower case
 */
public class Practice10d {
    public static void main(String[] args) {
        //convert uppercase characters to lowercase
        for(char ch='A'; ch <='Z'; ch++){
            System.out.print((char)(ch | ' '));
            //prints abcdefghijklmnopqrstuvwxyz
        }
        System.out.println();
    }
}
