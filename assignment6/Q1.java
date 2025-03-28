package assignment6;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

        if(num%5==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
