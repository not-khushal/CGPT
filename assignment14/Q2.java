// 2. Reverse a String 
// Problem: 
// Write a Java program to reverse a given string without using any built-in reverse functions. 


package assignment14;
import java.util.Scanner;

public class Q2 {
    
    public static String stringReverse(String text){
        String rev = "";
        char ch;
        for(int i = 0; i<text.length(); i++){
            ch = text.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner myObj =  new Scanner(System.in);
        System.out.println("Enter a string ");
        String text = myObj.next();

        System.out.println("Reversing of string using without built-in function is " + stringReverse(text));
    }
}
