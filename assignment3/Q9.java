package assignment3;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of sides of the triangle");
        float a = myObj.nextFloat();
        float b = myObj.nextFloat();
        float c = myObj.nextFloat();
        
        float total = a+b+c;
        float rounds = 5000/total;

        System.out.println("the total perimeter of the triangle is " + total);
        System.out.println("he required number of rounds to complete 5km run are " + rounds);
    }
}
