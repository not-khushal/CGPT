package assignment12;
import java.util.Scanner;
public class Q8 {
    private static void genArrayIndexOutOfBoundsException(String[] text){
        String[] str = new String[10];
        System.out.println(str[10]);
    }
    private static void handleArrayIndexOutOfBoundsException(String[] text){
        String[] str = new String[10];
        try {
            System.out.println(str[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the names");
        String[] test = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the name of " + (i+1) + " person ");
            test[i] = myObj.next();
        }
        try{
            genArrayIndexOutOfBoundsException(test);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception in main " + e.getMessage());
        }

        handleArrayIndexOutOfBoundsException(test);
    }
}
    

