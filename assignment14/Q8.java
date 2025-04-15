// Compare Two Strings
// Problem: 
// Write a Java program to compare two strings lexicographically 
// (dictionary order) without using built-in compare methods. 
// Example Input: 
// String 1: "apple" 
// String 2: "banana" 
// Expected Output: 
// "apple" comes before "banana" in lexicographical order


package assignment14;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first string");
        String text1 = myObj.next();
        System.out.println("Enter second string");
        String text2 = myObj.next();
        
        System.out.println("Before Lexicographical Order: " + text1 + " " + text2);
        
        // Compare strings without using built-in methods
        int minLength = Math.min(text1.length(), text2.length());
        String result = "";
        
        for (int i = 0; i < minLength; i++) {
            if (text1.charAt(i) < text2.charAt(i)) {
                result = text1 + " comes before " + text2 + " in lexicographical order";
                break;
            } else if (text1.charAt(i) > text2.charAt(i)) {
                result = text2 + " comes before " + text1 + " in lexicographical order";
                break;
            }
        }
        
        if (result.isEmpty()) {
            if (text1.length() < text2.length()) {
                result = text1 + " comes before " + text2 + " in lexicographical order";
            } else if (text1.length() > text2.length()) {
                result = text2 + " comes before " + text1 + " in lexicographical order";
            } else {
                result = "Both strings are equal";
            }
        }
        
        System.out.println("After Lexicographical Order: " + result);
        myObj.close();
    }
}