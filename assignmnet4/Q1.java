package assignment4;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = myObj.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
