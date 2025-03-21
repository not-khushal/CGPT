package assignment3;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter principle amount");
        float p = myObj.nextFloat();
        System.out.println("Enter rate");
        float r = myObj.nextFloat();
        System.out.println("Enter time in years");
        float t = myObj.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("The SIMPLE INTEREST IS " + si);
    }
}
