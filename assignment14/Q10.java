package assignment14;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();
        System.out.println("Enter the character to be remove");
        String ch = myObj.next();

        System.out.println("The string after removing " + ch + " will be " + text.replace(ch, ""));
    }
}
