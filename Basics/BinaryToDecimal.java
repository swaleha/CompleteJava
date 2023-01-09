import java.util.*;
public class BinaryToDecimal {

    //This method converts binary to decimal number
    public static void binToDecimal(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        int lastDigit = 0;

        while(binNum > 0){
            lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " +myNum+ " is " + dec);
    }

    public static void main(String args[]){
        binToDecimal(1010);
    }
}
