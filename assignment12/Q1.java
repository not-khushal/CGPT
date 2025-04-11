package assignment12;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Check if the two strings are equal are not");
        System.out.println("Enter the first string");
        String str1 = myObj.next();
        System.out.println("Enter the second string");
        String str2 = myObj.next();

        System.out.println("Checking using charAt");
        boolean isEqual = true;
        if(str1.length() != str2.length()) {
            isEqual = false;
        } else {
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println(isEqual);
        
        System.out.println("Checking using Equals");
        System.out.println(str1.equals(str2));
        
    }
}
