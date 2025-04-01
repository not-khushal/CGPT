package assignment9;
import java.util.Scanner;
public class Q5 {
    
    public static int statusCheck(int num) {
        if(num<0) {
            System.out.println("Negative number");
        }
        else if(num==0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive number");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = myObj.nextInt();

        System.out.println("Value of number is " + statusCheck(number));
    }}
