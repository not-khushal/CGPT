package assignment14;
import java.util.Scanner;
import org.w3c.dom.Text;

public class Q5 {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        String longest = findLongestWord(sentence);
        System.out.println("The longest word is: " + longest);
        
        scanner.close();
    }
}
