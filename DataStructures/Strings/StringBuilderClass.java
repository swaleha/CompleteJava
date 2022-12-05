/**
 * Time complexity is O(26)
 */

import java.util.*;
public class StringBuilderClass {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }


}
