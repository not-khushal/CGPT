package assignment12;
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Check if the two strings are equal are not");
        System.out.println("Enter the main string");
        String str = myObj.next();

        String str1;
        String str2;

        System.out.println("Generating a substring using charAt()");
        str1 = String.valueOf(str.charAt(3)) + String.valueOf(str.charAt(4));
        System.out.println(str1);

        System.out.println("Generating a substring using substring()");
        str2 = str.substring(3, 5);
        System.out.println(str2);

        System.out.println("Comparing both the strings");
        System.out.println(str1.equals(str2));
    }}