package assignment4;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

        int count = 0;
        for(int i=num; i>0; i=i/10){
            count++;
        }
        System.out.println(count);
    }
}
