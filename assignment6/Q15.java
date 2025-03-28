package assignment6;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

        int fact = 1;
        
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
