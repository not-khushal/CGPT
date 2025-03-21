package assignment2;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Base Value");
        double b = myObj.nextDouble();
        System.out.println("Enter Height Value");
        double h = myObj.nextDouble();

        double area = 0.5*b*h;
        System.out.println("Area of the triangle is " + area);
    }
}
