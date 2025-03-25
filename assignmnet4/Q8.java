package assignment4;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

        int orig = num;
        int sum = 0;

        while(num!=0){
            sum += num%10;
            num /= 10;
        }
        if(orig%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}
