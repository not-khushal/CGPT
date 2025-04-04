package assignment10;
import java.util.Scanner;
public class Q3 {
    
    public static  String leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return "Leap Year";
        }
        else{
            return "Not a Leap year";
        }
    }
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = myObj.nextInt();

        System.out.println(leapYear(y));
    }
}
