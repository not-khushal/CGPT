package assignment2;

import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int student = myObj.nextInt();

        int handshake = ((student*(student-1))/2);

        System.out.println("Total number of handshakes are " + handshake);
    }
}
