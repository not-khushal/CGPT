// res=(num1>num2) ? (num1+num2):(num1-num2)
package assignment4;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter year");
        int year = myObj.nextInt();

        int leap;
        const isLeapYear = year % 4 === 0 ? (year % 100 === 0 ? (year % 400 === 0 ? true : false) : true) : false;


        leap = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)?(System.out.println("Leap Year")):(System.out.println("Not Leap Year"));
    }
}
