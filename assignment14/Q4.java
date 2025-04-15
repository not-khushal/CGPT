// Remove Duplicates from a String 
// Problem: 
// Write a Java program to remove all duplicate characters from a given string and return the modified string. 

package assignment14;
import java.util.Scanner;

public class Q4 {
    
    public static String removeDuplicates(String text){
        String blank = "";
        for(int i=0; i<text.length(); i++){
            if(!blank.contains(String.valueOf(text.charAt(i)))) {
                blank += text.charAt(i);
            }
        }
        return blank;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();

        System.out.println(removeDuplicates(text));
    }
}
