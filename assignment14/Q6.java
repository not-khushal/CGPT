// Find Substring Occurrences 
// Problem: 
// Write a Java program to count how many times a given substring occurs in a string.


package assignment14;
import java.util.Scanner;
public class Q6 {
    

    public static int countOccurences(String text1, String text2){
        int count = 0;
        int index = 0;
        while ((index = text1.indexOf(text2, index)) != -1) {
            count++;
            index += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the main string");
        String mainText = myObj.next();
        System.out.println("Enter the substring");
        String subText = myObj.next();

        System.out.println("Number pf occurences of substring in main string is " + countOccurences(mainText, subText));
    }
}
