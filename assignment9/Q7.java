package assignment9;
import java.util.Scanner;
public class Q7 {
    
    public static int sumTotal(int num){
        int sum = 0;
        for(int i=0; i<=num; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = myObj.nextInt();


        System.out.println("Sum of the first " + number + " is " + sumTotal(number));
    }
}
