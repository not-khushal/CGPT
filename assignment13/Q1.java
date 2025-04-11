package assignment13;
import java.util.Scanner;

public class Q1 {

    private static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = myObj.next();
        System.out.println("Length of string: " + findLength(str));
    }
}