/*
 * Determine if 2 Strings are anagrams of each other.
 * If two strings contain the same characters but in a different order,they can be said to be anagrams.
 * Consider race and care.In this case,race's characters can be formed into a study,or care's characters can be formed into race.
 */
import java.util.*;
public class Assignment9d {
        public static void main(String args[]){
            String str1 = "earth";  //maker:remake, top:pot, ring:grin
            String str2 = "heart";

            //convert strings to same case
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            //check string lengths
            if(str1.length() == str2.length()){

                //convert string to char array
                char[] str1charArray = str1.toCharArray();
                char[] str2charArray = str2.toCharArray();

                //sort the arrays
                Arrays.sort(str1charArray);
                Arrays.sort(str2charArray);

                boolean result = Arrays.equals(str1charArray, str2charArray);

                if(result){
                    System.out.println(str1 + " and " + str2 + " are anagrams of each other");
                } else {
                    System.out.println(str1 + " and " + str2 + " are not anagrams of each other");

                }

            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
    }
}
