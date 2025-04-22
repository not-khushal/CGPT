package assignment16;
import java.util.Scanner;

public class Q6 {

    public static int factRecursion(int number){
        if(number == 0){
            return 1;
        }
        else{
            return number*factRecursion(number-1);
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number for factorial you want");
        int number = myObj.nextInt();

        System.out.println(factRecursion(number));
    }
}