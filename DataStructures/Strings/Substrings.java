import java.util.*;
public class Substrings {
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }

        return substr;
    }

    public static void main(String args[]){
        String str = "Hello World";

        System.out.print("Sub string using java's inbuilt string function: ");
        System.out.println(str.substring(0, 5));

        System.out.print("Sub string using user-defined/custom function is: ");
        System.out.println(substring(str, 0, 5));
    }
}
