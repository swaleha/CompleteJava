/*
 * Using recursive function to remove duplicate letters [a - z] from a string
 * Note: Type conversion in expressions: 'b' - 'a' = 1; 'c' - 'a' = 2 etc
 */

public class RemoveDuplicatesInStr {

    public static void removeDuplicates(String str, int idx, boolean map[], StringBuilder newStr) {
        //Base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, map, newStr);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, map, newStr.append(currChar));
        }
    }
    public static void main(String[] args) {
        String str = "helllooowoorld";
        removeDuplicates(str, 0, new boolean[26], new StringBuilder(""));
    }
}