package assignment9;
import java.util.Scanner;

public class Q3 {
    
    public static int handShakes(int num) {
        int total = (num*(num-1))/2;
        return total;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int students = myObj.nextInt();

        System.out.println("total handshakes among "  + students + " is " + handShakes(students));

    }
}
