/*
 * Time complexity: O(n) -> here n is proportional to the length of the string
 */

public class firstAndLastOccurence {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurrence(String str, int idx, char element) {
        //Base case
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurrence(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurrence(str, 0, 'a');
    }
}
