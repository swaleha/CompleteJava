package Algorithms;
/*
 * Time complexity - O(n) 
 */

public class LinearSearch {

    //search for number from an integer array
    public static int linear_search_int(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    //search for the key in string array
    
    public static int linear_search_str(String menu[], String key_str){
        for(int i=0; i<menu.length;i++){
            if(menu[i] == key_str){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        String menu[] = {"idli", "dosa", "upma", "chole bhature", "samosa", "uttapam", "pav bhaji", "frooti", "tea", "coffee"};
        int key = 14;
        String key_str = "chole bhature";
        int index = linear_search_int(numbers, key);
        if(index == -1){
            System.out.println("NOT found");
        } else {
            System.out.println("Key " + key + " is found at the index : " + index);
        }

        int str_index = linear_search_str(menu, key_str);
        if(str_index == -1){
            System.out.println("NOT found");
        } else {
            System.out.println("Key " + key_str + " is found at the index : " + str_index);
        }
    }
}
