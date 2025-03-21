package assignment2;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of miles");
        float mile = myObj.nextFloat();

        float yards = 1760*mile;
        float feet = yards*3;
        System.out.println("The conversion in yards is " + yards);
        System.out.println("The conversion in feet is " + feet);
    }
}
