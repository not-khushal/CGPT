package assignment2;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the price for 1 unit");
        float unit = myObj.nextFloat();
        System.out.println("Enter the total number of units to be bought");
        float num = myObj.nextFloat();

        System.out.println("The total price is " + (unit*num));
    }
}
