package assignment14;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();
        System.out.println("Enter the word to be replaced");
        String oldWord = myObj.next();
        System.out.println("Enter the new word to be placed");
        String newWord = myObj.next();

        System.out.println("String before replacement " + text);
        System.out.println("String after replacement " + text.replace(oldWord, newWord));
    }
}
