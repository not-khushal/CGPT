package assignment12;

import java.util.Scanner;

public class Q6 {

    private static void genIllegalArgumentException(String text){
        String str1 = text.substring(0, text.length()+1);
        System.out.println(str1.length());
    }

    private static void handleIllegalArgumentException(String text){
        String str1 = text.substring(0, text.length()+1);
        try{
            System.out.println(str1.length());
        } catch (IllegalArgumentException e){
            System.out.println("Caught  IllegalArgumentException" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str  = myObj.next();

        try{
            genIllegalArgumentException(str);
        } catch(IllegalArgumentException e){
            System.out.println("Exception in main: " + e.getMessage());
        }

        handleIllegalArgumentException(str);
    }


}
