package assignment9;
import java.util.Scanner;
public class Q10 {
    
    public static String distribution(int student, int chocolate){
        int equal = chocolate/student;
        int remaining = chocolate%student;
        return equal + " , " + remaining;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of children");
        int child = myObj.nextInt();
        System.out.println("Enter the number of chocolate");
        int choco = myObj.nextInt();

        System.out.println("The number of chocolates per child and remaining are  " + distribution(child, choco));
    }
}
