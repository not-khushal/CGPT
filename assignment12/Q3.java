package assignment12;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("String into Array");
        System.out.println("Enter a string");
        String str = myObj.next();

        System.out.println("Converting string into array using toCharArray()");
        char[] strArray = str.toCharArray();

        System.out.println("Displaying the characters of string as elements of array");
        for(int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}
