package assignment16;
import java.util.Scanner;
public class Q2 {
    public static String largestNum(int a, int b, int c){
        String result = "";
        if(a>b && a>c){
            result = "First was the largest out of three numbers " + a;
        }
        else if(b>a && b>c){
            result = "Second was the largest out of three numbers " + b;
        }
        else{
            result = "Third was the largest out of three numbers " + c;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = myObj.nextInt();
        System.out.println("Enter the second number");
        int b = myObj.nextInt();
        System.out.println("Enter the third number");
        int c = myObj.nextInt();

        System.out.println(largestNum(a, b, c));
    }
}
