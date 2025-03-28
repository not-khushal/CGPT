package assignment5;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();
        int fact = 1;

        while(num!=0){
            fact *= num;
            num--;
        }
     
        System.out.println("Factorial is " + fact);
    }
}
