package assignment16;
import java.util.Scanner;
public class Q9 {

    public static float findAdd(float num1, float num2){
        float result = num1+num2;
        return result;
    }
    public static float findSub(float num1, float num2){
        float result = num1-num2;
        return result;
    }
    public static float findMul(float num1, float num2){
        float result = num1*num2;
        return result;
    }
    public static float findDiv(float num1, float num2){
        float result = num1/num2;
        return result;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = myObj.nextFloat();
        System.out.println("Enter the second number");
        float num2 = myObj.nextFloat();
        System.out.println("Choose the operation to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int op = myObj.nextInt();
        if(op==1){
            System.out.println("Addition : " + findAdd(num1, num2));
        }
        else if(op==2){
            System.out.println("Subtraction : " + findSub(num1, num2));
        }
        else if(op==3){
            System.out.println("Multiplication : " + findMul(num1, num2));
        }
        else if(op==4){
            System.out.println("Division : " + findDiv(num1, num2));
        }
        else{
            System.out.println("Invalid operation");
        }
    }
}
