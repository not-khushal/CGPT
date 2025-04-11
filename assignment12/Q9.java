package assignment12;
import java.util.Scanner;
public class Q9 {

    private static String asciiCoversion(String text){
        char[] text1 = text.toCharArray();
        for(int i=0; i<text1.length; i++){
            int ascii = (int) text1[i];
            if (ascii >= 65 && ascii <= 90){
                text1[i] = ((char)(ascii + 32));
            }
        }
        return String.valueOf(text1);
        
    }   
        public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = myObj.next();
        System.out.println("Enter second string");
        String str2 = myObj.next();
        String strUC1 = str1.toUpperCase();
        System.out.println("String 1 after converting into uppercase " + strUC1);
        asciiCoversion(str2);
        String strUC2 = str2;
        System.out.println("String 2 after converting into uppercase " + strUC2);



        System.out.println("Comparing both strings");
        if(strUC1.equals(strUC2.toUpperCase())){
            System.out.println("Both Strings are Equal");
        }

    }
}