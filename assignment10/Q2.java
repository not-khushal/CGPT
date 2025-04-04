package assignment10;
import java.util.Scanner;
public class Q2 {
    public static int sumLoop(int num){
        int sum1 = 0;
        for(int i=0; i<=num; i++){
            sum1 = sum1 + i;
        }
        return sum1;
    }
    public static int sumRecursive(int num){
        if(num==1){
            return 1;
        }
        else{
            return num+sumRecursive(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = myObj.nextInt();

        System.out.println("The sum of first " + number + " natural numbers by " + sumLoop(number) + " and by recursive is " + sumRecursive(number));
    }

}
