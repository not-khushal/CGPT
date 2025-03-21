package assignment2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of side of the square");
        float side = myObj.nextFloat();

        float perimeter = side*4;
        System.out.println("Perimete rof the square is " + perimeter);
    }
}
