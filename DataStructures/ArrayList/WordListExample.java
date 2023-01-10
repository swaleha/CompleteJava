import java.util.ArrayList;

public class WordListExample {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();

        //add values to the word list
        wordList.add("First");
        wordList.add("Second");

        //retrieve value from position 0 and print it
        System.out.println(wordList.get(0));
    }
}
