package assignment4;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num  = myObj.nextInt();

        int sum = 0;
        int orig = num;
        int rem;


        while(orig!=0){
            rem = orig%10;
            sum = sum + (int) Math.pow(rem,3);
            orig /= 10;
        }
        if(sum == num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
