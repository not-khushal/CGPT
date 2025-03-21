package assignment3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter salary");
        int salary = myObj.nextInt();
        System.out.println("Enter bonus");
        int bonus = myObj.nextInt();

        int total = salary+bonus;
        System.out.println("Total salary is " + total);

    }
}