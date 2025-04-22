package assignment16;
import java.util.Scanner;
public class Q3 {

    public static String primeCheck(int number){
        String result = "It is a prime";
        for(int i=2; i<number; i++){
            if(number%i==0){
                result = "It is not a prime";
                // break;
            }
        }
        return result;
    }    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = myObj.nextInt();

        System.out.println(primeCheck(number));
    }
}
