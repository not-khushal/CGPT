// Palindrome String Check 
// Problem: 
// Write a Java program to check if a given string is a palindrome (a string that reads the same forward and backward). 


package assignment14;
import java.util.Scanner;
public class Q3 {
    
    public static String palindromeString(String text){
        String rev = "";
        String orginal = text;
        char c;
        String results = "";
        for(int i = 0; i<text.length(); i++){
            c = text.charAt(i);

            rev = c + rev;
        }
        if(orginal.equals(rev)){
            results =  "it is a palindrome";
        }
        else{
            results =  "it is not a palindrome";
        }
        return results;
    }    public static void main(String[] args) {
        Scanner myObj  = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();

        System.out.println(palindromeString(text));
    }


}
