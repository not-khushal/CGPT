package assignment16;
import java.util.Scanner;
public class Q7 {
    public static int findGCD(int num1, int num2) {
        int i;
        if(num1<num2){
            i = num1;
        }
        else{
            i = num2;
        }
        for(i = i; i>1; i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        return 1;
    }
    public static int findLCM(int num1, int num2){
        int i = (num1>num2) ? num1:num2;
        while(true){
            if(i%num1==0 && i%num2==0){
                return i;
            }
            i++;
        }
    }    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = myObj.nextInt();
        System.out.println("Enter the second number");
        int num2 = myObj.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + findLCM(num1, num2));
    }
}
