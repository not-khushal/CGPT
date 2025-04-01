package assignment9;
import java.util.Scanner;
public class Q8 {
    
    public static String statusCheck(int a, int b, int c){
        if(a<b && a<c){
            return "first number is smallest " + a ;
            
        }
        else if(b<a && b<c){
            return "second number is smallest " + b;
            
        }
        else{
            return "third number is smallest " + c;
            
        }

        // return "is the smallest";
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = myObj.nextInt();
        System.out.println("Enter the second number");
        int num2 = myObj.nextInt();
        System.out.println("Enter the third number");
        int num3 = myObj.nextInt();

        System.out.println(statusCheck(num1, num2, num3));
    }

}
