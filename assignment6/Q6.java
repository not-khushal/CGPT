package assignment6;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = myObj.nextInt();

        if(num==0){
            System.out.println("Zero");
        }
        else if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
