package assignment6;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = myObj.nextInt();
        System.out.println("Enter second number");
        int num2 = myObj.nextInt();
        System.out.println("Enter third number");
        int num3 = myObj.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("1st is largest");
        }
        else if(num2>num3){
            System.out.println("2nd is largest");
        }
        else{
            System.out.println("3rd is largest");
        }
    }
}
