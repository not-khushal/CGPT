// Toggle Case of Characters 
// Problem: 
// Write a Java program to toggle the case of each character in a given string.
// Convert uppercase letters to lowercase and vice versa. 

package assignment14;
import java.util.Scanner;
public class Q7 {

    public static String toggleCharacters(String text) {
        String results = "";
        for(int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if(c >= 65 && c <= 90) {
                results += Character.toLowerCase(c);
            }
            else if(c >= 97 && c <= 122) {
                results += Character.toUpperCase(c);
            }
            else {
                results += c;
            }
        }
        return results;
    }
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();
        System.out.println(toggleCharacters(text));
        myObj.close();
    }
}