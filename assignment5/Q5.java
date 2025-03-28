package assignment5;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

        while(num!=0){
            if(num%3==0 && num%5==0){
                System.out.println("FizzBuzz");
                break;
            }
            else if(num%3==0){
                System.out.println("Fizz");
                break;
            }
            else if(num%5==0){
                System.out.println("Buzz");
                break;
            }
            else{
                System.out.println(num);
                break;
            }

        }
    }
}