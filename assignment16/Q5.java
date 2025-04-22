package assignment16;
import java.util.Scanner;
public class Q5 {
    public static String palindromeCheck(String text){
        String result = "";
        String rev = "";
        char ch;
        for(int i=0; i<text.length(); i++){
            ch = text.charAt(i);
            rev = ch + rev;
        }
        if(rev.equals(text)){
            result = "It is a palindrome";
        }
        else{
            result = "It is not a palindrome";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = myObj.next();

        System.out.println(palindromeCheck(text));
    }
}
