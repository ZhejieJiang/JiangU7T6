import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSortTest
{
    public static void main(String[] args)
    {
        System.out.println("------- TESTING SELECTION SORT -------");
        ArrayList<String> allWords = new ArrayList<String>();

        loadWordsInto(allWords);
        System.out.println("This list contains " + allWords.size() + " common words");

        System.out.println("Unsorted:");
        System.out.println(allWords);

        Sort.selectionSortWordList(allWords);

        System.out.println("Sorted:");
        System.out.println(allWords);

        System.out.println("------- TESTING INSERTION SORT -------");
        ArrayList<String> allWords2 = new ArrayList<String>();

        loadWordsInto(allWords2);
        System.out.println("This list contains " + allWords2.size() + " common words");

        System.out.println("Unsorted:");
        System.out.println(allWords2);

        Sort.insertionSortWordList(allWords2);
        System.out.println("Sorted:");
        System.out.println(allWords2);
    }

    public static void loadWordsInto(ArrayList<String> wordList)
    {
        try
        {
            Scanner input = new Scanner(new File("words.txt"));
            while (input.hasNext())
            {
                String word = input.next();
                wordList.add(word);
            }
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}