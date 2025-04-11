package assignment12;

import java.util.Scanner;

public class Q5 {

    private static void genStrIndexOutOfBoundsExcp(String text){
        String str = String.valueOf(text.charAt(text.length()+1));
        System.out.println(str.length());
    }

    private static void handleStrIndexOutOfBoundsExcp(String text){
        String str = String.valueOf(text.charAt(text.length()+1));
        try {
            System.out.println(str.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }}


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = myObj.next();
        try{
            genStrIndexOutOfBoundsExcp(str);
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception in main: " + e.getMessage());
        }

        handleStrIndexOutOfBoundsExcp(str);

    }
}