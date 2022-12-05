/*
* Time complexity is O(X*N) -> X is the length of input and N is the number of times the for-loop runs
* compareTo() function compares characters lexicographically and prints the largest one 
* eg: str1 = aaaabad and str2 = aaaabae -> here str2 is largest lexicographically
*/

public class LargestString{
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println("Largest string lexicographically is: " + largest);
    }
}
