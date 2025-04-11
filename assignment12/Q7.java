package assignment12;
import java.util.Scanner;
public class Q7 {
    
    private static void genNumberFormatException(String text){
        int num = Integer.parseInt(text);
        System.out.println(num);
    }
    private static void handleNumberFormatException(String text){
        int num = Integer.parseInt(text);
        try {
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException " + e.getMessage());
        }}
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string with no integers in between");
        String str = myObj.next();

        try {
            genNumberFormatException(str);
        } catch (NumberFormatException e) {
            System.out.println("Exception in main " + e.getMessage());
        }

        handleNumberFormatException(str);
    }
    }

