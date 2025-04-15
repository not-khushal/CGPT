// 1. Count Vowels and Consonants 
// Problem: 
// Write a Java program to count the number of vowels and consonants in a given string


package assignment14;
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();

        int vCount = 0;
        int cCount = 0;

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='a' ||text.charAt(i)=='e' ||text.charAt(i)=='i' ||text.charAt(i)=='o' ||text.charAt(i)=='u'){
                vCount++;
            }
            else{
                cCount++;
            }
        }
        System.out.println("The number of vowels is " + vCount + " and the number of consonants are " + cCount);
    }
}
